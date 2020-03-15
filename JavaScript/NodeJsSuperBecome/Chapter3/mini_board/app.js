const http = require("http");
const fs = require("fs");
const ejs = require("ejs");
const url = require("url");
const qs = require("querystring");

const index_page = fs.readFileSync("./index.ejs", "utf8");
const login_page = fs.readFileSync("./login.ejs", "utf8");
const style_css = fs.readFileSync("./style.css", "utf8");

const max_num = 10;
const filename = "mydata.txt";
var message_data;

const saveToFile = fname => {
  let data_str = message_data.join("\n");
  fs.writeFileSync(fname, data_str, err => {
    if (err) {
      throw err;
    }
  });
};

const addToData = (id, msg, fname, request) => {
  let obj = { id: id, msg: msg };
  let obj_str = JSON.stringify(obj);
  console.log("add data" + obj_str);
  message_data.unshift(obj_str);
  if (message_data.length > max_num) {
    message_data.pop();
  }
  saveToFile(fname);
};

const readFromFile = fname => {
  fs.readFile(fname, "utf8", (err, data) => {
    message_data = data.split("\n");
  });
};

const write_index = (request, response) => {
  let msg = "何かメッセージを書いてください。";
  let content = ejs.render(index_page, {
    title: "Index",
    content: msg,
    data: message_data,
    filename: "data_item"
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
      addToData(data.id, data.msg, filename, request);
      write_index(request, response);
    });
  } else {
    write_index(request, response);
  }
};

const response_login = (request, response) => {
  let content = ejs.render(login_page, {});
  response.writeHead(200, { "Content-Type": "text/html" });
  response.write(content);
  response.end();
};

const getFromClient = (request, response) => {
  const url_parts = url.parse(request.url, true);
  switch (url_parts.pathname) {
    case "/":
      response_index(request, response);
      break;

    case "/login":
      response_login(request, response);
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

readFromFile(filename);

const server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
