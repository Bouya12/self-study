const express = require("express");
const ejs = require("ejs");

const app = express();

app.engine("ejs", ejs.renderFile);

app.get("/", (req, res) => {
  res.render("index.ejs", {
    title: "index",
    content: "This is Express-app Top Page!"
  });
});

app.listen(3000, () => {
  console.log("Server is runnning!");
});
