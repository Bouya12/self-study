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

const Message = Bookshelf.Model.extend({
  tableName: "messages",
  hasTimestamps: true,
  user: () => {
    return this.belongsTo(User);
  }
});

router.get("/", (req, res, next) => {
  if (req.session.login === undefined) {
    res.redirect("/users");
  } else {
    res.redirect("/1");
  }
});

router.get("/:page", (req, res, next) => {
  if (req.session.login === undefined) {
    res.redirect("/users");
    return;
  }
  let pg = req.params.page;
  pg *= 1;
  if (pg < 1) {
    pg = 1;
  }
  new Message()
    .orderBy("created_at", "DESC")
    .fetchPage({ page: pg, pageSize: 10, withRelated: ["user"] })
    .then(collection => {
      const data = {
        title: "miniBoard",
        login: req.session.login,
        collection: collection.toArray(),
        pagination: collection.pagination
      };
      res.render("index", data);
    })
    .catch(err => {
      res.status(500).json({ error: true, data: { message: err.message } });
    });
});

router.post("/", (req, res, next) => {
  const rec = {
    message: req.body.msg,
    user_id: req.session.login.id
  };
  new Message(rec).save().then(model => {
    res.redirect("/");
  });
});

module.exports = router;
