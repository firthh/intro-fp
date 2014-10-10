var db;
db.getTaxRate = function() {};


function calculateTax(amount) {
    var taxRate = db.getTaxRate();
    return taxRate / amount * 100;
}

function calculateTax(amount,  taxRate) {
    db.saveTaxRate(taxRate);
    return taxRate / amount * 100;
}

function calculateTax(amount,  taxRate) {
    return taxRate / amount * 100;
}

for (int i = 0; i < count; i++) {
     //do something
}

while(someCondition) {
     //do something
}

foreach(var something in somethings) {
     //do something
}

var numbers = [1, 2, 3, 4, 5];
for(var i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}

//numbers => [2, 4, 6, 8, 10]


var numbers = [1, 2, 3, 4, 5];
var destination = [];
for(var i = 0; i < numbers.length; i++) {
    var result = numbers[i] * 2;
    destination.push(result);
}

//destination => [2, 4, 6, 8, 10]


var n = 1; 
var num_elements = 0; 
var sum_of_first_10 = 0;
while (num_elements < 10) { 
    if (n^2 % 5 == 0) {
        sum_of_first_10 += n; 
        num_elements += 1; 
    } 
    n += 1; 
}
//sum_of_first_10 => 225