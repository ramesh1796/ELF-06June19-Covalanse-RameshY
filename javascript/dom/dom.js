// let name =document.getElementById('name');
// console.log(name);
// console.log(name.textContent);
// name.style.color= 'skyblue';
// var classCollection=document.getElementsByClassName('demo');
// console.log(classCollection);
// classCollection[0].style.fontSize='300px';
// classCollection[0].style.color='green';
// //document.getElementById('myButton').className='button';
// document.getElementById('myButton').classList='button1 button';
// var querySelect = document.querySelector('p');
// console.log(querySelect);
// var querySelectAll = document.querySelectorAll('.demo');
// console.log(querySelectAll);

// let input = document.createElement('input');
// document.body.appendChild(input);

/* var classDemo = document.getElementsByClassName('demo');
 console.log("By class name="+classDemo.length);

 var classDemo1 = document.querySelectorAll('.demo');
 console.log("By querySelector name="+classDemo1.length);

 console.log("Number of elements with query selectorall ="+classDemo.length);
 console.log("Number of elements with getClassByname ="+classDemo1.length);

 document.getElementById('pele').className='blue';

 console.log("Number of elements with query selectorall ="+classDemo.length);
 console.log("Number of elements with getClassByname ="+classDemo1.length); */

 let button = document.getElementById('myButton');
/*  button.onclick= 

 function createNewElement(){
     document.getElementById('div1').innerHTML = '<a href="https://www.google.com">Anchor Tag</a>';
 }; */

 button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com">Anchor Tag</a>';
 });