var http = require('http');
var url = require('url');
http.createServer(function(request, response) {
    response.write("hello world")
    response.writeHead(200, { 'Content-Type': 'text/html' });
    var data = url.parse(request.url, true).query;
    response.end();
}).listen(8087)