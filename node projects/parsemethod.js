var http = require('http');
var url = require('url');

http.createServer(function(request, response) {
    var met = request.method;
    var query = require('querystring');
    if (met == 'GET') {
        response.writeHead(200, 'Content-Type', 'text/html');
        response.write('reached to get method');
        response.end();
    } else if (met == 'POST') {
        response.writeHead(200, 'Content-Type', 'text/html');
        response.write('reached to get method');
        var s = ""
        request.on('data', function(a) {
            s = s + a;
        });
        request.on('end', function() {
            var s = query.parse(s);
            response.write(s.username, s.password);
        })
    }
}).listen(8080);