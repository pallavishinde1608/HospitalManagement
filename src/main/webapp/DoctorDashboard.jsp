<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link href="CSS/Login-Dash-Board.css" rel="stylesheet">
<link href="CSS/Admin-style.css" rel="stylesheet">
<link href="CSS/doctor-dash-board.css" rel="stylesheet">
<style>

/* Style the dropdown button */
.container-fluid{
   width:100%;

}
.nav-content{
display:flex;}
.logo-name {
	
	width:70%;
}
.dropbtn {
    background-color: #4DA6FF;
    color: white;
    margin-left:120px;
    padding:10px;
    font-size:25px;
    border: none;
    cursor: pointer;
}

/* Style the dropdown content (hidden by default) */
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    width:150px;
   
    z-index: 1;
    font-size:15px;
    margin-left:120px;
}

/* Style links inside the dropdown */
.dropdown-content a {
    color: black;
    padding:10px 15px;
    text-decoration: none;
    display: block;
    
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {
    background-color: #4DA6FF;
    color:white;
    
}

/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content {
    display: block;
}

</style>
</head>
<body>
<div class="container-fluid">
   
      <div class="nav-bar">
        <div class="logo-name">
            <img src="images/hs.png" class="img1"><h2>HOSPITAL MANAGEMENT SYSTEM!!</h2>
        </div>
        <div class="nav-content">
      <div class="dropdown">
    <button class="dropbtn">Doctor</button>
    <div class="dropdown-content">
        <a href="AddDoctor.jsp">Add Dotcor</a>
        <a href="ViewDoctor.jsp">View Doctor</a>
        <a href="SearchDoctor.jsp">Serach Doctor</a>
    </div>
</div>
 <div class="dropdown">
    <button class="dropbtn">Patient</button>
    <div class="dropdown-content">
        <a href="AddDoctorpage.jsp">Add Patient</a>
        <a href="ViewDoctor.jsp">View Patient</a>
        <a href="">Serach Patient</a>
    </div>
</div>


</div>
        
        </div>
       </div>
       
       <script>
    $(document).ready(function(){
        $('.dropdown-toggle').dropdown();
    });
</script>
       <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</body>
</html>