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
      res.render("hello", data);
    }
  });

  connection.end();
});

module.exports = router;
