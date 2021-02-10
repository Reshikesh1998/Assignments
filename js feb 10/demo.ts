console.log("hello world")

class Employee
{
    id;
    ename;
    salary;
    constructor(id,ename,salary)
    {
        this.ename = ename;
        this.salary = salary;
        this.id = id;
    }

    getdata()
    {
        return this.id + " " + this.ename + "  " + this.salary  ;
    }
}

var x:number = 10;

for(var i = x; i >0; i--){

var e= new Employee(1,"abc",10000);
console.log(e.getdata());
var name1:string = "John";
console.log(name1);
}