const http = require("http");
const fs = require("fs");
const ejs = require("ejs");
const url = require("url");

const index_page = fs.readFileSync("./index.ejs", "utf8");
const style_css = fs.readFileSync("./style.css", "utf8");

let getFromClient = (request, response) => {
  let url_parts = url.parse(request.url, true);
  switch (url_parts.pathname) {
    case "/": {
      let content = "これはインデックスページです。";
      let query = url_parts.query;
      if (query.msg !== undefined) {
        content += "あなたは、「" + query.msg + "」と送りました。";
      }
      content = ejs.render(index_page, {
        title: "Index",
        content: content
      });
      response.writeHead(200, { "Content-Type": "text/html" });
      response.write(content);
      response.end();
      break;
    }

    case "/style.css": {
      response.writeHead(200, { "Content-Type": "text/css" });
      response.write(style_css);
      response.end();
      break;
    }

    default:
      response.writeHead(200, { "Content-Type": "text/plain" });
      response.end("no page...");
      break;
  }
};

let server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
