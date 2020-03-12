const http = require("http");
const fs = require("fs");

let getFromClient = (request, response) => {
  fs.readFile("./index.html", "UTF-8", (error, data) => {
    let content = data
      .replace(/dummy_title/g, "タイトルです")
      .replace(/dummy_content/g, "これがコンテンツです。");

    response.writeHead(200, { "Content-Type": "text/html" });
    response.write(content);
    response.end();
  });
};

let server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
