var a = 10;
console.log(a);
var b = a;
console.log(b);
b=20;
console.log(a);
console.log(b);


// console.log("P name= "+person.name);
// var person1 = person;
// console.log("P1 name= "+person1.name);
// person1.name = 'Mohit';
// console.log("P name= "+person.name);
// console.log("P1 name= "+person1.name);

var hobbies = ['abxc', 'volleyball', 'football' ];
document.getElementById('demo').innerHTML = hobbies;
var person = {
    name : 'Vikas',
    age : 25,
    city: 'banglore'

};

// for(var i=0; i<hobbies.length;i++){
//     console.log("Value ="+hobbies[i]);
// }
// hobbies.forEach((val,index)=>{
//     console.log("Value ="+val);
//     console.log("index ="+index);
// });
// for(var val of hobbies){
//     console.log("Value ="+val);
// }
//console.log("=======================For in loop=======================");
// hobbies['test'] = 'somevalue';
// for(var index in hobbies){
//     console.log("Index ="+index);
//     console.log("Value ="+hobbies[index]);
// }
// console.log("=======================For of loop=======================");
// for(var val of hobbies){
//          console.log("Value ="+val);
//          console.log("Value ="+hobbies[index]);
//     }
// for(var index in person){
//     console.log("Index ="+index);
//     console.log("Value ="+person[index]);
// }
console.log("=======for of loop ========");
console.time("forof");
for(var i of hobbies){
    var a=[];
}
console.timeEnd("forof");
console.log("=======for of ended ========");

console.log("=======for in loop ========");
console.time("forin");
for(var i of hobbies){
    var a=[];
}
console.timeEnd("forin");
console.log("=======for in ended ========");