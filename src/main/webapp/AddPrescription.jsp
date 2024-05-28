<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Doctor-form.css" rel="stylesheet">
</head>
<body>
<%@include file="DoctorDashboard.jsp"%>

<div class="col-md-8 content">

   <form class="formarea" name="frm" action="AddPrescription" method="Post">
  <div class="form-group ">
   
   <lable for="doctorcode">Patient Id</lable><br>
  <input type="text"class="form-control control" name="pid" id="pid" placeholder="enter patient id"><br>
  
  <lable for="doctorcode">Doctor Id</lable><br>
  <input type="text"class="form-control control" name="did" id="did" placeholder=""><br>
  
  <lable for="doctorcode">Medicine Name</lable><br>
  <input type="text"class="form-control control" name="medicine" id="medicine" placeholder=""><br>
  
  </div>
  <button type="submit" class="btn bg-primary">Submit</button><br>
   
   </form>
           
        </div>
        </div>
     
     
     </div>
</body>
</html>