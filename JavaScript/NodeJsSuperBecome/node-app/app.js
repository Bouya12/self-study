const http = require("http");
const fs = require("fs");
const ejs = require("ejs");
const url = require("url");
const qs = require("querystring");

const index_page = fs.readFileSync("./index.ejs", "utf8");
const style_css = fs.readFileSync("./style.css", "utf8");

let data = { msg: "no message..." };

const setCookie = (key, value, response) => {
  let cookie = escape(value);
  response.setHeader("Set-Cookie", [key + "=" + cookie]);
};

const getCookie = (key, request) => {
  let cookie_data =
    request.headers.cookie !== undefined ? request.headers.cookie : "";
  let data = cookie_data.split(";");
  for (const i in data) {
    if (data[i].trim().startsWith(key + "=")) {
      let result = data[i].trim().substring(key.length + 1);
      return unescape(result);
    }
  }
  return "";
};

const write_index = (request, response) => {
  let msg = "※伝言を表示します。";
  let cookie_data = getCookie("msg", request);
  let content = ejs.render(index_page, {
    title: "Index",
    content: msg,
    data: data,
    cookie_data: cookie_data
  });
  response.writeHead(200, { "Content-Type": "text/html" });
  response.write(content);
  response.end();
};

const response_index = (request, response) => {
  if (request.method === "POST") {
    let body = "";

    request.on("data", data => {
      body += data;
    });

    request.on("end", () => {
      data = qs.parse(body);
      setCookie("msg", data.msg, response);
      write_index(request, response);
    });
  } else {
    write_index(request, response);
  }
};

const getFromClient = (request, response) => {
  let url_parts = url.parse(request.url, true);

  switch (url_parts.pathname) {
    case "/":
      response_index(request, response);
      break;

    case "/style.css":
      response.writeHead(200, { "Content-Type": "text/css" });
      response.write(style_css);
      response.end();
      break;

    default:
      response.writeHead(200, { "Content-Type": "text/plain" });
      response.end("no page...");
      break;
  }
};

let server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
