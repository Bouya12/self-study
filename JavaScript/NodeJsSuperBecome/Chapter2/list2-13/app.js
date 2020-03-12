const http = require("http");
const fs = require("fs");
const ejs = require("ejs");

const index_page = fs.readFileSync("./index.ejs", "utf8");

let getFromClient = (request, response) => {
  let content = ejs.render(index_page, {
    title: "index",
    content: "これはテンプレートを使ったサンプルページです。"
  });
  response.writeHead(200, { "Content-Type": "text/html" });
  response.write(content);
  response.end();
};

let server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
