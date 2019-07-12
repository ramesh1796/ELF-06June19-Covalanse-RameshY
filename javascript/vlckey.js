
//varKey()


// function varKey(){
//    // a=20;
//     console.log("aaa=="+a);
//     var a=10;
// }
// console.log("aaa=="+a);

// function letKey(){
//     b=20;
//     console.log("aaa=="+b);
// }
// console.log("aaa=="+b);


// function letKey(){
//     b=20;
//     console.log("aaa=="+b);
// }
// console.log("aaa=="+b);
// varKey()
// function varKey(){
    
//      console.log("aaa");
// }   


// var fName=function() {
    
//      console.log("BBBBB");
// };
var hobbies = ['abxc', 'volleyball', 'football' ];
var a= {};
//console.log(typeof hobbies);
//console.log(Array.isArray(hobbies));
//console.log(Array.isArray(a));
// console.log(hobbies.includes("abxc"));
// console.log(hobbies.push("Cricket"));
// console.log(hobbies);
// console.log(hobbies.pop());
// console.log(hobbies);
// console.log(hobbies.shift());
// console.log(hobbies);
// console.log(hobbies.unshift("New Value"));
// console.log(hobbies);

// console.log(hobbies.splice(0,0,'ggggggggg','hhhhhhhhhh'));
// console.log(hobbies);
//let hob=hobbies.slice(1);

//console.log(hobbies.join(''));
//console.log(hobbies.indexOf('football'));
// function first(sec){
//           setTimeout(()=>{
//             console.log("This is first");
//             sec();
//           },5000);
          
//      }  
//      function second(){
    
//         console.log("This is second");
//    }  

//    first(second);
  
const items = [
    {
        id : 1,
        name : 'book',
        price : 600
    },
    {
        id : 2,
        name : 'papper',
        price : 500
    },
    {
        id : 3,
        name : 'laptop',
        price : 55600
    },
    {
        id : 4,
        name : 'bike',
        price : 1111600
    }
];
console.log(items);
//items.map((value, index)=>{
let mappedId = items.map((value)=>{
return value.name;
});

console.log(mappedId);

let filteredValue = items.filter((value)=>{
    //return value.price > 600;
    return value.name ==='bike';
    });
    

    console.log(filteredValue);