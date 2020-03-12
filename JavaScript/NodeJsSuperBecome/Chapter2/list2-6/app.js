const http = require("http");
const fs = require("fs");

let getFromClient = (req, res) => {
  const request = req;
  const response = res;
  fs.readFile("./index.html", "UTF-8", (error, data) => {
    response.writeHead(200, { "Content-Type": "text/html" });
    response.write(data);
    response.end();
  });
};

let server = http.createServer(getFromClient);

server.listen(3000);
console.log("Server start!");
