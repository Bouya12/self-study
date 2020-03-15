const express = require("express");
const ejs = require("ejs");

const app = express();

app.engine("ejs", ejs.renderFile);

app.use(express.static("public"));

app.get("/", (req, res) => {
  let msg =
    "This is Express-app Top Page!<br>" +
    "これは、スタイルシートを利用した例です。";
  res.render("index.ejs", {
    title: "index",
    content: msg
  });
});

app.listen(3000, () => {
  console.log("Server is runnning!");
});
