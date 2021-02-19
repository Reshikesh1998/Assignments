var x = require('./HelloWorld.js');
console.log(x.a("the", "the empire needs help of the hero that willl be the one to concor this land bestowed upon by the great eperor the third"))

var f = require('fs')
f.writeFile("abc.txt", "hello how are you", function(err) {
    if (err) throw err;
    console.log("successful")
});


f.readFile("/home/thinkitive/Documents/jsonvalues.txt", function(err, data) {
    {
        if (err) throw err;
        console.log(data.toString());

    }
})