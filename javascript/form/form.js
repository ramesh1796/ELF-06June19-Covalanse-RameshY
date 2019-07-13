//let button = document.getElementById('myButton');
window.onload = function(){

    
};


function validateForm(){
    
    let myEmail = document.forms[0].email.value;
    let pass1 = document.forms[0].password.value;
    let pass2 = document.forms[0].cpassword.value;
   if(pass1.length>6 && pass2.length>6 && myEmail.length>6 && pass1===pass2){
    document.forms[0].myButton.disabled =false;
   }
   else{
    document.forms[0].myButton.disabled =true;
   }
}

/*  button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com">Anchor Tag</a>';
 }); */
/*  function validateForm(){
    let myEmail = document.forms[0].email.value;
    console.log(myEmail);
}

function validateButton(){
    let dvalue = document.forms[0].myButton.value;
    console.log();
} */

$(".reveal").on('click',function() {
    var $pwd = $(".pwd");
    if ($pwd.attr('type') === 'password') {
        $pwd.attr('type', 'text');
    } else {
        $pwd.attr('type', 'password');
    }
});