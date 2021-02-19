express = require('express');
app = express();
var cors = require('cors');
app.use(cors());
var functions = require('./dbconnection')
bodyp = require('body-parser');
app.use(bodyp.json());
app.use(bodyp.urlencoded({ extended: true }));
var name = "";
var id;
var salary;
var opr;

app.get('/', function(request, response) {
    response.sendfile(__dirname + "/" + "index.html");
});

app.get('/hi', function(request, response) {
    var user = request.query.username;
    var password = request.query.password;
    response.send(user + ":" + password);
})


app.post('/hi', function(request, response) {
    var user = request.body.username;
    var password = request.body.password;
    response.send("Inside post method" + user + ":" + password);
})

app.post('/crud', function(request, response) {
    name = request.body.name;
    id = request.body.id;
    salary = request.body.salary;
    opr = request.body.opr;
    console.log(request.body);

    var con = functions.getconnection();

    if (name != '' && salary != '' && id != '' && opr === "insert") {
        functions.insertemp(con, id, name, salary);
        console.log("inside create")
        response.send("Inside post method" + name + ":" + id + ":" + salary);
        response.end();

    }
    if (name != '' && salary != '' && id != '' && opr === "update") {

        functions.updateemp(con, name, salary, id);
        response.send("Inside post method" + name + ":" + id + ":" + salary);
        response.end();
    }
    if (id != null && opr === "delete") {
        functions.deleteemp(con, id);
        response.send("Inside post method" + name + ":" + id + ":" + salary);
        response.end();

    }
    functions.endconnection(con);
    response.end();

})

app.listen(8080)