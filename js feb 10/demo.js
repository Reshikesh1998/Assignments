console.log("hello world");
var Employee = /** @class */ (function () {
    function Employee(id, ename, salary) {
        this.ename = ename;
        this.salary = salary;
        this.id = id;
    }
    Employee.prototype.getdata = function () {
        return this.id + " " + this.ename + "  " + this.salary;
    };
    return Employee;
}());
var x = 10;
for (var i = x; i > 0; i--) {
    var e = new Employee(1, "abc", 10000);
    console.log(e.getdata());
    var name1 = "John";
    console.log(name1);
}
