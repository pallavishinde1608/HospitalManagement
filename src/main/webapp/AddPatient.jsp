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
@charset "UTF-8";
lable{
color:black;
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
  margin:50px;
  background-color:#4DA6FF;
  border:2px solid gray;
  box-shadow: 10px 10px gray;
  padding:10px;
  width:740px;
}
.control1{
margin-bottom:10px;
margin-top:10px;
}

</style>
</head>
<body>
<%@include file="ReceptionistDashBoard.jsp" %>
<div class="col-md-8 content">
   <form class="formarea" name="frm" action="patientInfo" method="Post">
  <div class="form-group ">
  <lable for="patient" style="margin-left:12px;">patient Name :</lable>
  <input type="text"class="form-control1 control1" name="name" id="machinecode" style="width:220px;" placeholder="enter patient name">
  
  
  <lable for="patient" style="margin-left:5px;">patient contact :</lable>
  <input type="text"class="form-control1 control1" name="address" id="machinecode" style="width:220px;" placeholder="enter patient contact" onkeyup="validecontact(this.value)">
  <span id="s" style="margin-left:500px;"></span><br>
   <lable for="patient">patient address :</lable>
  <input type="text"class="form-control1 control1" name="contact" id="machinecode" style="width:220px;" placeholder="enter patient address">
   
   <lable for="patient" style="margin-left:32px;">Patient Age :</lable>
  <input type="text"class="form-control1 control1" name="age" id="machinecode" style="width:220px;" placeholder="enter patient age">
   
   <lable for="patient" style="margin-left:3px;" >patient Gender :</lable>
   <select class="form-control1 control1" name="gender" id="machinecode" style="width:220px; padding:5px;" >
   <option>Female</option>
   <option>Male</option>
   <option>Transgender</option>
   </select>
   <lable for="patient" >Patient Category:</lable>
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
  <lable for="patient" style="margin-left:10px;">Patient Email &nbsp;&nbsp;:</lable>
   <input type="email"class="form-control1 control1" name="email" id="machinecode"  style="width:220px;" placeholder="enter patient email"  onkeyup="validateEmail(this.value)">
  
 <lable for="patient" style="margin-left:34px;">Admit Date :</lable>
   <input type="date"class="form-control1 control1" name="date" style="width:220px;" id="machinecode">
 <span id="e" style="margin-left:140px;"></span><br>
<lable for="patient" style="margin-left:24px;">Patient Type :</lable>
   <select class="form-control1 control1" name="type" id="machinecode" style="width:220px;padding:5px;" >
   <option>OPD</option>
   <option>IPD</option>
   </select>
   
 <lable for="patient" style="margin-left:76px;">Status :</lable>
    <select class="form-control1 control1" name="status" id="machinecode" style="width:220px;padding:5px;" >
   <option>Active</option>
   <option>Inactive</option>
   </select>
  </div>
  <button type="submit" class="btn bg-secondary" style="color:white;"">Add New patient</button><br>
   
   </form>
        
        
      <a href="ViewPatient.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;margin-left:50px;">Result</button></a>
   <a href="AddPatient.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;">Add New</button></a>  
        
        
        </div>
        
        </div>
     
     
     </div>
</body>
</html>