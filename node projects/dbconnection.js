var mysql = require("mysql");
module.exports = {
    getconnection() {
        var con = mysql.createConnection({ host: 'localhost', user: "root", password: "Reshikesh@1905", database: "nodeexample" });
        con.connect(function(err) {
            if (err) throw err;
            console.log("Connection Established!!!");
        });
        return con;
    },

    createemptable(con) {
        con.query("create table employeedetails(id int NOT NULL, name varchar(25), salary int , primary key(id))", function(err, result) {
            if (err) throw err;
            console.log("created")

        })
    },

    insertemp(con, id, name, salary) {
        con.query("insert into employeedetails(id, name, salary) values(?,?,?)", [id, name, salary], function(err, result) {
            if (err) throw err;
            console.log("inserted one record")

        })
    },

    deleteemp(con, id) {
        con.query("delete from employeedetails  where id = ? ", [id],
            function(err, result) {
                if (err) throw err;
                console.log("deleted")

            })
    },
    updateemp(con, name, salary, id) {
        let data = [name, salary, id];
        con.query("update employeedetails set name=?, salary=? where id=? ", data,
            function(err, result) {
                if (err) throw err;
                console.log("updated")

            })
    },
    endconnection(con) {
        con.end(function(err) {
            if (err) throw err;
            console.log("closed")
        })
    }
}