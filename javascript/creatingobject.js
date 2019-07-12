var person = {
    firstFame : 'Vikas',
    lastFame : 'Jain',
    age : 25,
    eyeColor : 'blue',
    getFullName : function(){
        return this.firstFame +""+this.lastFame;
    },
    address:{
        city : 'Banglore',
        state : 'Karnataka',
        pincode : 560068
    },
    hobbies : ['sleeping', 'oversleeping','watching movies']
    
};
console.log("First Name="+person.firstFame);
console.log("City="+person.address.city);
console.log("Full Name="+person.getFullName());
console.log("Hobbies="+person.hobbies);