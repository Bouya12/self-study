const express = require("express");
const ejs = require("ejs");

const app = express();
app.engine("ejs", ejs.renderFile);
app.use(express.static("public"));

const bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({ extended: false }));

app.get("/", (req, res) => {
  let msg = "This is Index Page!<br>" + "※メッセージを書いて送信して下さい。";
  res.render("index.ejs", {
    title: "index",
    content: msg
  });
});

app.post("/", (req, res) => {
  let msg =
    "This is Posted Page!<br>" +
    "あなたは「<b>" +
    req.body.message +
    "</b>と送信しました。";
  res.render("index.ejs", {
    title: "Posted",
    content: msg
  });
});

app.get("/other", (req, res) => {
  let name = req.query.name;
  let pass = req.query.pass;
  let msg =
    "あなたの名前は「" + name + "」<br>パスワードは「" + pass + "」です。";
  res.render("index.ejs", {
    title: "other",
    content: msg,
    link: { href: "/", text: "※トップに戻る" }
  });
});

app.listen(3000, () => {
  console.log("Server is runnning!");
});
