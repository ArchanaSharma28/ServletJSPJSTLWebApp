function ValidateUser() {
         var username= document.login.username.value;
		 var password=document.login.password.value;
		 
		 
		 if(username==""){
			 alert("Username cannot be empty");
			 document.login.username.focus();
			 return false;
		 }
		 
		 if(password=="")
		 {
			 alert("Password field is empty")
			 document.login.password.focus();
			 return false;
		 }
         return( true );
      }


  