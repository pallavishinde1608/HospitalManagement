<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Login-Dash-Board.css" rel="stylesheet">
<link href="CSS/login-page.css" rel="stylesheet">
<link href="CSS/Main-login.css" rel="stylesheet">
<style>
body{

background-image:url("images/earth.jpg");
background-repeat:no-repeat;
background-size:cover;
color:white;
height:530px;

}
a{
text-decoration:none;
margin-top:20px;
}

</style>
</head>
<body>
<div class="container-fluid">
   
      <div class="nav-bar">
        <div class="logo-name">
            <img src="images/hs.png" class="img1"><h2 style="color:white;">HOSPITAL MANAGEMENT SYSTEM!!</h2>
        </div>
        <div class="nav-content">
        <ul>
        <li><a href="LoginDashBoard.jsp">Home</a></li>
        <li><a href="LoginDashBoard.jsp">About Us</a></li>
        <li><a href="LoginDashBoard.jsp">Contact</a></li>
        <li><a href="LoginDashBoard.jsp">Service</a></li>
         <li><a href="Main-Login-Page.jsp">Login</a></li>
        </ul>
        
        </div>
      
      </div>
      
   <div class="login-page">
          <div class="admin-login">
           <a href="LoginPage.jsp">Admin</a><br>
           <img src="images/admin1.png" class="img">
          </div>
          <div class="main-login">
          <div class="doctor-login">
          <a href="DoctorLoginPage.jsp">Employee</a><br><br>
          <img src="images/doctorimg.jpeg" class="img1">
          </div>
          <div class="patient-login">
          <a href="PatientLiginPage.jsp">Patient</a><br><br>
            <img src="images/patientimg.png" class="img1">
          </div>
          </div>
   </div>
  </div>

</body>
</html>