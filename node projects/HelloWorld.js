console.log("Hello world!");
a = 10;

console.log("hi");

exports.a = function(word, sen) {
    c = 0;
    sen = sen.split(" ");
    for (i of sen) {
        console.log(i)
        if (i === word) {
            c++;
        }
    }

    return c;
}