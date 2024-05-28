<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <link href="CSS/Admin-style.css" rel="stylesheet">
 <style>
 h1{
 margin-top:10px;
 margin-left:5px;
 }
 .nav-img{
 color:white;
 display:flex;
 width:50%;
 }
 .nav-bar{
 diplay:flex;
 width:222vh;
 background-color:#4D4DFF;
 
 }
 .content-bar{
 
  height:80px;
  width:50%;
 
 }
 .content-bar ul{
margin-top:20px; 
margin-left:100px;

}
.content-bar ul li{
    display: inline;
    padding: 5px;
    font-size: 15px;
   
    
  }
  .content-bar ul li a
        {
            text-decoration: none;
             color:white; 
            padding-left:10px;
            font-size: 25px;
            
            
        }
 .img1
{
	width:70px;
	height:70px;
	margin-top:10px;
	margin-left:5px;
	
}
 
 </style>
</head>
<body>

     <div class="container-fluid mycontainer">
     <div class="row nav-bar">
       <div class="col-md-12 nav-img">   
        <img src="<%="images/hs.png"%> " class="img1"><h1>Hospital Management System</h1>
       
       </div>
       
        
       <div class="content-bar">
        <ul>
        <li><a href="LoginDashBoard.jsp">Home</a></li>
        <li><a href="LoginDashBoard.jsp">About Us</a></li>
        <li><a href="LoginDashBoard.jsp">Contact</a></li>
        <li><a href="LoginDashBoard.jsp">Service</a></li>
         <li><a href="LoginDashBoard.jsp">Logout</a></li>
        
        </ul>
        
        </div>
       
       
     </div>
        <div class="row">
        <div class="col-md-4 admin-sidebar">
   
    <a class="button" href="ViewDoctorRecep.jsp"> <img src="<%="images/doctor1.png"%>" class="img3">View Doctor</a>
   
    <a class="button" href="AddPatient.jsp"><img src="<%="images/patient.png"%>" class="img3">Patient</a>
  
    <a class="button" href="ViewBill.jsp"> <img src="<%="images/bill.png"%>" class="img3">View Bill</a>
    
       </div>
       
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>


</body>
</html>