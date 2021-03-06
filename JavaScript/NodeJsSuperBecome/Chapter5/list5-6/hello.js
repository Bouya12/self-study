const express = require("express");
const router = express.Router();

router.get("/", (req, res, next) => {
  let msg = "※何か書いて送信して下さい。";
  if (req.session.message !== undefined) {
    msg = `Last Msessage: ${req.session.message}`;
  }
  const data = {
    title: "Hello!",
    content: msg
  };
  res.render("hello", data);
});

router.post("/post", (req, res, next) => {
  const msg = req.body["message"];
  req.session.message = msg;
  const data = {
    title: "Hello!",
    content: `Last Msessage: ${req.session.message}`
  };
  res.render("hello", data);
});

module.exports = router;
