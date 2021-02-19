var http = require('http');
var url = require('url');
var functions = require('./dbconnection')
var name = "";
var id;
var salary;
var opr;
http.createServer(function(req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    var data = url.parse(req.url, true).query
    name = data.name;
    salary = data.salary;
    id = data.id;
    opr = data.opr;

    var con = functions.getconnection();
    if (name != '' && salary != null && id != null && opr === "insert") {
        functions.insertemp(con, id, name, salary);
        res.end();

    }
    if (name != '' && salary != null && id != null && opr === "update") {

        functions.updateemp(con, name, salary, id);
        res.end();
    }
    if (id != null && opr === "delete") {
        functions.deleteemp(con, id);
        res.end();

    }





    functions.endconnection(con);
}).listen(8080)