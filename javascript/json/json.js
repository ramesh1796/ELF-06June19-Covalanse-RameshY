/* var library=[
    {
        id:1,
        author:'Bill Gates',
        name: 'Bill'

    },
    {
        id:2,
        author:'Chetan',
        name :'Half Girlfriend'
    },
    {
        id:3,
        author:'Chetan',
        name :'One Night Stand'
    }
];
var jsonLibrary=JSON.stringify(library);
console.log(jsonLibrary);
var objLibrary=JSON.parse(jsonLibrary);
console.log(objLibrary); */

/* let num=prompt("Enter Number");
console.log(factorial(num));
function factorial(n){
    if(n===0 || n===1){
        return 1;
    }
    else{
        return factorial(n-1)*n;
    }

} */


/* function counter(){
    var counter =0;
    function getCount(){
       counter++;
       return counter;
    }
    return getCount;
}

let count = counter();
var value = count();
console.log(value);
var value1 = count();
console.log(value1); */


/* var dSalary = (function(){
var salary =60000; 
function changeBy(amount){
    salary += amount;
}
return {
    raise: function(){
        changeBy(5000);
    },
   lower: function(){
        changeBy(-5000);
    },
    currentAmount: function(){
        return salary;
    }

};
})();

alert(dSalary.currentAmount());  
dSalary.raise();
alert(dSalary.currentAmount());
dSalary.lower();

dSalary.lower();
alert(dSalary.currentAmount());
dSalary.changeBy(10000);
 */

var promise = new Promise((res,rej)=>{
    const items = [{id:1, name:'Sonam'},{id:2,name:'Ajay'}];
    if(items.length>4){
        res(items);
    }
    else{
        rej("rejected");
    }
});

promise.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
});