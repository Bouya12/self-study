const express = require("express");
const router = express.Router();

const mysql = require("mysql");

const mysql_setting = {
  host: "localhost",
  user: "root",
  password: "",
  database: "my-nodeapp-db"
};

const knex = require("knex")({
  dialect: "mysql",
  connection: {
    host: "localhost",
    user: "root",
    password: "",
    database: "my-nodeapp-db",
    charset: "utf8"
  }
});

const Bookshelf = require("bookshelf")(knex);

const MyData = Bookshelf.Model.extend({
  tableName: "mydata"
});

router.get("/", (req, res, next) => {
  new MyData()
    .fetchAll()
    .then(collection => {
      const data = {
        title: "Hello!",
        content: collection.toArray()
      };
      res.render("hello/index", data);
    })
    .catch(err => {
      res.status(500).json({ error: true, data: { message: err.message } });
    });
});

router.get("/add", (req, res, next) => {
  const data = {
    title: "Hello/Add",
    content: "新しいレコードを入力：",
    form: { name: "", mail: "", age: 0 }
  };
  res.render("hello/add", data);
});

router.post("/add", (req, res, next) => {
  const response = res;
  new MyData(req.body).save().then(model => {
    response.redirect("/hello");
  });
});

router.get("/show", (req, res, next) => {
  const id = req.query.id;

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "SELECT * FROM mydata WHERE id=?",
    id,
    (error, results, fields) => {
      if (error === null) {
        const data = {
          title: "Hello/show",
          content: `id = ${id} のレコード`,
          mydata: results[0]
        };
        res.render("hello/show", data);
      }
    }
  );

  connection.end();
});

router.get("/edit", (req, res, next) => {
  const id = req.query.id;

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "SELECT * FROM mydata WHERE id = ?",
    id,
    (error, results, fields) => {
      if (error === null) {
        const data = {
          title: "Hello/edit",
          content: `id = ${id} のレコード`,
          mydata: results[0]
        };
        res.render("hello/edit", data);
      }
    }
  );

  connection.end();
});

router.post("/edit", (req, res, next) => {
  const id = req.body.id;
  const name = req.body.name;
  const mail = req.body.mail;
  const age = req.body.age;
  const data = { name, mail, age };

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "UPDATE mydata SET ? WHERE id = ?",
    [data, id],
    (error, results, fields) => {
      res.redirect("/hello");
    }
  );

  connection.end();
});

router.get("/delete", (req, res, next) => {
  const id = req.query.id;

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "SELECT * FROM mydata WHERE id = ?",
    id,
    (error, results, fields) => {
      if (error === null) {
        const data = {
          title: "Hello/delete",
          content: `id = ${id} のレコード`,
          mydata: results[0]
        };
        res.render("hello/delete", data);
      }
    }
  );

  connection.end();
});

router.post("/delete", (req, res, next) => {
  const id = req.body.id;

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "DELETE FROM mydata WHERE id = ?",
    id,
    (error, results, fields) => {
      res.redirect("/hello");
    }
  );

  connection.end();
});

router.get("/find", (req, res, next) => {
  const data = {
    title: "/Hello/Find",
    content: "検索IDを入力：",
    form: { fstr: "" },
    mydata: null
  };
  res.render("hello/find", data);
});

router.post("/find", (req, res, next) => {
  new MyData()
    .where("id", "=", req.body.fstr)
    .fetch()
    .then(collection => {
      const data = {
        title: "Hello!",
        content: `※id = ${req.body.fstr} の検索結果：`,
        form: req.body,
        mydata: collection
      };
      res.render("hello/find", data);
    });
});

module.exports = router;
