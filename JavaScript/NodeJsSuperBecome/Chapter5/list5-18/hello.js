const express = require("express");
const router = express.Router();

const mysql = require("mysql");

const mysql_setting = {
  host: "localhost",
  user: "root",
  password: "",
  database: "my-nodeapp-db"
};

router.get("/", (req, res, next) => {
  const connection = mysql.createConnection(mysql_setting);
  connection.connect();
  connection.query("SELECT * FROM mydata", (error, results, fields) => {
    if (error === null) {
      const data = { title: "mysql", content: results };
      res.render("hello/index", data);
    }
  });

  connection.end();
});

router.get("/add", (req, res, next) => {
  const data = {
    title: "Hello/Add",
    content: "新しいレコードを入力："
  };
  res.render("hello/add", data);
});

router.post("/add", (req, res, next) => {
  const name = req.body.name;
  const mail = req.body.mail;
  const age = req.body.age;
  const data = { name, mail, age };

  const connection = mysql.createConnection(mysql_setting);
  connection.connect();

  connection.query(
    "INSERT INTO mydata SET ?",
    data,
    (error, results, fields) => {
      if (error === null) {
        res.redirect("/hello");
      }
    }
  );

  connection.end();
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

module.exports = router;
