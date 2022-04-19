import http from "http";

const server = http.createServer((req, res) => {
  res.writeHead(200, { "Content-Type": "text/html" });
  res.end("Hello Korea!!!");
});

server.listen(8000, () => {
  console.log("Server Start http://localhost:8000");
});
