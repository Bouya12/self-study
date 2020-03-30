const express = require("express");
const router = express.Router();

const MarkdownIt = require("markdown-it");
const matkdown = new MarkdownIt();

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

const markpage = (req, res, model, flg) => {
  let footer;
  if (flg) {
    const d1 = new Date(model.attributes.created_at);
    const dstr1 = `${d1.getFullYear()}-${d1.getMonth + 1}-${d1.getDate}`;
    const d2 = new Date(model.attributes.updated_at);
    const dstr2 = `${d2.getFullYear()}-${d2.getMonth + 1}-${d2.getDate}`;
    footer = `(created: ${dstr1}, updated: ${dstr2})`;
  } else {
    footer = "(Updating date and time informaition..";
  }
  const data = {
    title: "Markdown",
    id: req.params.id,
    head: model.attributes.title,
    footer: footer,
    content: matkdown.render(model.attributes.content),
    source: model.attributes.content
  };
  res.render("mark", data);
};

router.get("/", (req, res, next) => {
  res.redirect("/");
  return;
});

router.get("/:id", (req, res, next) => {
  const request = req;
  const response = res;
  if (req.session.login === undefined) {
    res.redirect("/login");
    return;
  }
  Markdata.query({
    where: { user_id: req.session.login.id },
    andWhere: { id: req.params.id }
  })
    .fetch()
    .then(model => {
      markpage(request, response, model, true);
    });
});

router.post("/:id", (req, res, next) => {
  const request = req;
  const response = res;
  const obj = new Markdata({ id: req.params.id }).save(
    { content: req.body.source },
    { patch: true }.then(model => {
      markpage(request, response, model, false);
    })
  );
});

module.exports = router;
