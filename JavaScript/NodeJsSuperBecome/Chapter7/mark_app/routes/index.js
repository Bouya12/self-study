const express = require("express");
const router = express.Router();

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

const Markdata = Bookshelf.Model.extend({
  tableName: "markdata",
  hasTimestamps: true,
  user: () => {
    return this.belongsTo(User);
  }
});

router.get("/", (req, res, next) => {
  if (req.session.login === undefined) {
    res.redirect("/login");
    return;
  }
  new Markdata(["title"])
    .orderBy("created_at", "DESC")
    .where("content", "=", req.session.login.id)
    .fetchPage({ page: 1, pageSize: 10, withRelated: ["user"] })
    .then(collection => {
      const data = {
        title: "Markdown Search",
        login: req.session.login,
        message: "※最近の投稿データ",
        form: { find: "" },
        content: collection.toArray()
      };
      res.render("index", data);
    });
});

router.post("/", (req, res, next) => {
  new Markdata()
    .orderBy("created_at", "DESC")
    .where("content", "like", `%${req.body.find}%`)
    .fetchAll({ withRelated: ["user"] })
    .then(collection => {
      const data = {
        title: "Markdown Search",
        login: req.session.login,
        message: `※"${req.body.find}"で検索された最近の投稿データ`,
        form: req.body,
        content: collection.toArray()
      };
      res.render("index", data);
    });
});

module.exports = router;
