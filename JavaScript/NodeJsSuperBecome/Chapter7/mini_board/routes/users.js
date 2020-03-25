const express = require("express");
const router = express.Router();

const { check, validationResult } = require("express-validator");

const mysql = require("mysql");

const knex = require("knex")({
  client: "mysql",
  connection: {
    host: "localhost",
    user: "root",
    password: "",
    database: "my-nodeapp-db",
    charset: "utf8"
  }
});

const Bookshelf = require("bookshelf")(knex);

const User = Bookshelf.Model.extend({
  tableName: "users"
});

router.get("/add", (req, res, next) => {
  const data = {
    title: "Users/Add",
    form: { name: "", password: "", comment: "" },
    content: "※登録する名前・パスワード・コメントを入力ください。"
  };
  res.render("users/add", data);
});

router.post(
  "/add",
  [
    check("name")
      .not()
      .isEmpty()
      .withMessage("NAME は必ず入力して下さい。"),
    check("password")
      .not()
      .isEmpty()
      .withMessage("PASSWORD は必ず入力して下さい。")
  ],
  (req, res, next) => {
    const result = validationResult(req);
    if (!result.isEmpty()) {
      let content = "<ul class='error'>";
      const result_arr = result.array();
      for (const re of result_arr) {
        content += `<li>${re.msg}</li>`;
      }
      content += "</ul>";
      const data = {
        title: "Users/Add",
        content: content,
        form: req.body
      };
      res.render("users/add", data);
    } else {
      req.session.login = null;
      new User(req.body).save().then(model => {
        res.redirect("/");
      });
    }
  }
);

router.get("/", (req, res, next) => {
  const data = {
    title: "Users/Login",
    form: { name: "", password: "" },
    content: "名前とパスワードを入力下さい。"
  };
  res.render("users/login", data);
});

router.post(
  "/",
  [
    check("name")
      .not()
      .isEmpty()
      .withMessage("NAME は必ず入力して下さい。"),
    check("password")
      .not()
      .isEmpty()
      .withMessage("PASSWORD は必ず入力して下さい。")
  ],
  (req, res, next) => {
    const result = validationResult(req);
    if (!result.isEmpty()) {
      let content = "<ul class='error'>";
      const result_arr = result.array();
      for (const re of result_arr) {
        content += `<li>${re.msg}</li>`;
      }
      content += "</ul>";
      const data = {
        title: "Users/Login",
        content: content,
        form: req.body
      };
      res.render("users/login", data);
    } else {
      const name = req.body.name;
      const password = req.body.password;
      User.query({ where: { name }, andWhere: { password } })
        .fetch()
        .then(model => {
          if (model === null) {
            const data = {
              title: "再入力",
              content: "<p class='error'>名前またはパスワードが違います。",
              form: req.body
            };
            res.render("users/login", data);
          } else {
            req.session.login = model.attributes;
            const data = {
              title: "Users/Login",
              content: `<p>
                          ログインしました！<br>
                          トップページに戻ってメッセージを送信下さい。
                        </p>`,
              form: req.body
            };
            res.render("users/login", data);
          }
        });
    }
  }
);

module.exports = router;
