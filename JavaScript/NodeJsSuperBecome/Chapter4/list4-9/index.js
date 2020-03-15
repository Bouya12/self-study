const express = require("express");
const ejs = require("ejs");

const app = express();
app.engine("ejs", ejs.renderFile);
app.use(express.static("public"));

app.get("/", (req, res) => {
  let msg = "This is Index Page!<br>" + "これは、トップページです。";
  res.render("index.ejs", {
    title: "index",
    content: msg,
    link: { href: "/other", text: "※別のページに移動" }
  });
});

app.get("/other", (req, res) => {
  let msg = "This is Other Page!<bt" + "これは用意された別のページです。";
  res.render("index.ejs", {
    title: "other",
    content: msg,
    link: { href: "/", text: "※トップに戻る" }
  });
});

app.listen(3000, () => {
  console.log("Server is runnning!");
});
