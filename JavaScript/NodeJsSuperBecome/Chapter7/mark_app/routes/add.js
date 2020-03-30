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
  res.render("add", { title: "Add" });
});

router.post("/", (req, res, next) => {
  const rec = {
    title: req.body.title,
    content: req.body.content,
    user_id: req.session.login.id
  };
  new Markdata(rec).save().then(model => {
    res.redirect("/");
  });
});

module.exports = router;
