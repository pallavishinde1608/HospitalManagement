<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">


function validecontact(str) {
    var span = document.getElementById("s");
    let pattern = /[0-9]/g; 
    let isValid = pattern.test(str);
    if (isValid && str.length==10) {
    	 let span=document.getElementById("s");
        span.innerHTML = "valid contact";
        span.style.color = "green";
    } else {
    	 let span=document.getElementById("s");
        span.innerHTML = "invalid contact";
        span.style.color = "red";
    }
}

function validateEmail(str)
{     var span=document.getElementById("e");
	 let pattern=/^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,3}$/g;
       let result=str.match(pattern);
      document.getElementById("e").innerHTML=result;
      if(result!=null)
      {  span.innerHTML="valid email address";
         span.style.color="green";
      }
	else{
         span.innerHTML="invalid email address";
	   span.style.color="red";
	}
}

</script>
<style>
label{
color:black;
width:170px;
font-size:17px;
}

input{
padding:5px;


}


.formarea{
  margin:50px;
  background-color:#4DA6FF;
  border:2px solid gray;
  box-shadow: 10px 10px gray;
  padding:10px;
  width:820px;
}
.control1{
margin-bottom:10px;
margin-top:10px;

}


</style>
</head>
<body>
<%@include file="AdminDashBoard.jsp" %>

<div class="col-md-8 content">

   <form class="formarea" name="frm" action="AddRecep" method="Post">
  <div class="form-group ">
  <label for="doctorcode">Receptionist Name &nbsp;&nbsp;:</label>
  <input type="text"class="form-control1 control1" name="name" style="width:220px;" id="machinecode" placeholder="enter recep name">
   <label for="doctorcode">Receptionist email :</label>
  <input type="text"class="form-control1 control1" name="email" style="width:220px;" id="machinecode" placeholder="enter recep email" onkeyup="validateEmail(this.value)">
 
   <label for="doctorcode">Receptionist contact :</label>
  <input type="text"class="form-control1 control1" name="contact"  style="width:220px;" id="machinecode" placeholder="enter recep contact" onkeyup="validecontact(this.value)">
 <span id="e" style="margin-left:200px;"></span><br> <span id="s" style="margin-left:170px;"></span> 
  </div>
  <button type="submit" style="color:white;" class="btn bg-secondary">Submit</button><br>
   
   </form>
    <a href="ViewRecep.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;margin-left:50px;">Result</button></a>
   <a href="AddRecep.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;">Add New</button></a>
   
        </div>
        </div>
     </div>
</body>
</html>