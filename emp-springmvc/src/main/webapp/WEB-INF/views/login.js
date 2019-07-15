function showPassword(){

     let pass= document.getElementId("password");
    
    if(pass.type==="password")
    {
        console.log(pass);
      pass.type='text';
 }
 else{
    console.log(pass);
     pass.type='password';       
 }
    
}