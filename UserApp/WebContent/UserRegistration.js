function ValidateUser() {
         var username= document.register.username.value;
         var address=document.register.Address.value;
		 var password=document.register.password.value;
		 var confirm=document.register.confirmpwd.value;
		 re = /[0-9]/;
		 rl= /[a-z]/;
		 ru= /[A-Z]/;
		 if(username==""){
			 alert("Username cannot be empty");
			 document.register.username.focus();
			 return false;
		 }
		 
		 if(password=="")
		 {
			 alert("Password field is empty")
			 document.register.password.focus();
			 return false;
		 }
		 
		 if(address==""){
			 alert("Address cannot be empty");
			 document.register.Address.focus();
			 return false;
		 }
		 if(confirm==""){
			 alert("Confirm Password cannot be empty");
			 document.register.confirmpwd.focus();
			 return false;
		 }
		 
		 if(password.length<6)
		 {
			 alert("Password must be more than 6 characters")
			  document.register.password.focus();
			 return false;
		 }
		 
		 if(!re.test(password)){
			 alert("Password must have atleast 1 number")
			  document.register.password.focus();
			 return false;
		 }
		 if(!rl.test(password)){
			 alert("Password must have atleast 1 lowercase")
			 document.register.password.focus();
			 return false;
		 }
		  if(!ru.test(password)){
			 alert("Password must have atleast 1 UpperCase")
			 document.register.password.focus();
			 return false;
		 }
		  
		  if(password!=confirm){
			  alert("Password & Confirm Password doesnt match");
			  document.register.password.focus();
			  return false;
		  }
		  
         return( true );
      }


  