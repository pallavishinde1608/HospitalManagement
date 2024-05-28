<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="CSS/Login-Dash-Board.css" rel="stylesheet">
<link href="CSS/LoginPage.css" rel="stylesheet">
<style>
.login-page{

background-image:url("images/homepageimg.jpg");
background-repeat:no-repeat;
background-size:cover;
color:white;
height:530px;

}


</style>
</head>
<body>
<div class="container-fluid">
   
      <div class="nav-bar">
        <div class="logo-name">
            <img src="images/hs.png" class="img1" ><h2 style="color:white;">HOSPITAL MANAGEMENT SYSTEM!!</h2>
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
  
        <form action="doctorlogin" method="post" class="container">
            <h2>Login</h2>
            <div class="Select">
            
            <lable for="patient" style="color:black;">Select Role</lable>
            <select class="form-control control" name="employee" id="employee" >
            <option>Receptionist</option>
            <option>Doctor</option>
             </select>
           </div>
            <div class="email">
             <ion-icon name="mail-outline" style="margin-right: -54px;margin-bottom:-21px; background-color:rgb(51, 116, 255);width:50px;height:50px;"></ion-icon>
           <input type="email" name="username" id="username"  placeholder="Example@gmail.com" >

           </div>
           <div class="password">
            <ion-icon name="lock-open-outline" style="margin-right: -54px;margin-bottom:-21px; background-color:rgb(51, 116, 255);width:50px;height:50px;"></ion-icon>
            <input type="password" name="password" id="password" placeholder="password">
            <i class="bi bi-eye-slash" id="togglePassword"></i> </div>
            <button value="Submit" >Submit</button>
            <p>Not member?<a href="#">Create account here</a></p>


</form>
    </div>
   
      </div>
      
      
      <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>