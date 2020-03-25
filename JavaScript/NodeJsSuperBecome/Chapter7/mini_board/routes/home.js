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
    return this.belongTo(User);
  }
});

router.get("/", (req, res, next) => {
  res.redirect("/");
});

router.get("/:id", (req, res, next) => {
  res.redirect(`/home/${req.params.id}/1`);
});

router.get("/:id/:page", (req, res, next) => {
  let id = req.params.id;
  id *= 1;
  let pg = req.params.page;
  pg *= 1;
  if (pg < 1) {
    pg = 1;
  }
  new Message()
    .orderBy("create_at", "DESC")
    .where("user_id", "=", id)
    .fetchPage({ page: pg, pageSizze: 10, withRelated: ["user"] })
    .then(collection => {
      const data = {
        title: "miniBoard",
        login: req.session.login,
        user_id: id,
        collection: collection.toArray(),
        pagination: collection.pagination
      };
      res.render("home", data);
    })
    .catch(err => {
      res.status(500).json({ error: true, data: { message: err.message } });
    });
});

module.exports = router;
