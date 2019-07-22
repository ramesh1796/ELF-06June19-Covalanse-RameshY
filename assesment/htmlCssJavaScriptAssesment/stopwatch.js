/*function clock() {
    var myTimer = setInterval(myClock, 1000);
    var c=0;

    function myClock() {
      document.getElementById("time").innerHTML = c++;
      if (c == time) {
        clearInterval(myTimer);
        alert("Time");
      }
    }
  }*/
 var h=0;
var m=0;
var s=0;
function to_start(){

switch(document.getElementById('btn').value)
{
case  'Stop':
window.clearInterval(tm); // stop the timer 
document.getElementById('btn').value='Start';
break;
case  'Start':
tm=window.setInterval('disp()',1000);
document.getElementById('btn').value='Stop';
break;
}
}


function disp(){
// Format the output by adding 0 if it is single digit //
if(s<10){var s1='0' + s;}
else{var s1=s;}
if(m<10){var m1='0' + m;}
else{var m1=m;}
if(h<10){var h1='0' + h;}
else{var h1=h;}
// Display the output //
str= h1 + ':' + m1 +':' + s1 ;
document.getElementById('n1').innerHTML=str;
// Calculate the stop watch // 
if(s<59){ 
s=s+1;
}else{
s=0;
m=m+1;
if(m==60){
m=0;
h=h+1;
} // end if  m ==60
}// end if else s < 59
// end of calculation for next display

}