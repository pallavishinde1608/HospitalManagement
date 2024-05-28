<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*" %>
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
@charset "UTF-8";
label{
color:black;
width:150px;
font-size:17px;
}

input{
padding:5px;


}

.content h3{
color:white;
margin-top:10px;

}
.formarea{
  margin:30px;
  background-color:#4DA6FF;
  border:2px solid gray;
  box-shadow: 10px 10px gray;
  padding:10px;
  width:850px;
}
.control1{
margin-bottom:10px;
margin-top:10px;
}
@media (max-width: 767px) {
    label {
        display: block;
        width: 100%;
        margin-bottom: 5px;
    }

    .formarea {
        padding: 20px;
    }

    .control1 {
        width: 100%;
    }

    input, select, button {
        width: 100%;
        margin-bottom: 10px;
    }

    .content h3 {
        text-align: center;
    }
}
</style>

</head>
<body>
<%@include file="AdminDashBoard.jsp" %>

<div class="col-md-8 content">
   
   <form class="formarea" name="frm" action="addDoctor" id="add" method="Post">
   <h3>Add Doctor</h3>
  <label for="doctorcode">Doctor Name :</label>
   <input type="text" class="form-control1 control1" style="width:220px;" name="name" placeholder="enter doctor name">
 <label for="doctorcode" >&nbsp;&nbsp; Specialization  :</label>
  <input type="text" class="form-control1 control1" style="width:220px;" name="specialization" id="machinecode" placeholder="enter doctor Specialization ">
  <br> <label for="doctorcode">Doctor Contact :</label>
  <input type="text" class="form-control1 control1" style="width:220px;" name="contact" id="machinecode" placeholder="enter doctor contact" onkeyup="validecontact(this.value)">
  
   <label for="doctorcode">&nbsp;&nbsp;Doctor Email :</label>
  <input type="Email" class="form-control1 control1" style="width:220px;" name="Email" id="machinecode" placeholder="enter doctor email" onkeyup="validateEmail(this.value)">
 <br> <span id="s" style="margin-left:200px;"></span>  <span id="e" style="margin-left:300px;"></span>
  <br><label for="doctorcode"  >Doctor Schedule :</label>
  
    <select  class="form-control1 control1" style="width:220px;padding:5px;" name="schedule" id="machinecode">
    <option>09-11</option>
    <option>11-01</option>
    <option>02-04</option>
    <option>04-06</option>
    <option>06-08</option>
    <option>09-10</option>
   
    </select> 
   <label for="doctorcode">&nbsp;&nbsp;Doctor Category :</label>
  <select  class="form-control1 control1" style="width:220px;padding:5px;" name="category" id="machinecode">
    <option>General</option>
    <option>Ortho</option>
    <option>Dantist</option>
    <option>Neurologists</option>
    <option>radiologist</option>
    <option>Surgeons</option>
    <option>Psychiastrists</option>
    <option>Cardiologist</option>
 </select>
  <br><br><button type="submit" class="btn bg-secondary" style="color:white;">Submit</button><br><br>
  
   </form>
    <a href="ViewDoctor.jsp?v=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;margin-left:30px;">Result</button></a>
   <a href="AddDoctor.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;">Add New</button></a>
   
  
</div>
</body>
</html>