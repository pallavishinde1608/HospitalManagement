<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Login-Dash-Board.css" rel="stylesheet">
<style>
.about-page{
            
            min-height:600px;
            position: relative;
           
        }
        .container{
        
            position: absolute;
            top:10%;
            max-width:800px;
            background-color:white;
            margin-left:300px;
            padding: 16px;
        
        }
.content-bar{
background-image:url("images/homepageimg.jpg");
background-repeat:no-repeat;
background-size:cover;
color:white;
height:530px;

}
.main{
background-color:lightblue;
height:500px;

}

.service{
   
    padding-left:20px;
    padding-top:10px;
    min-height:550px;
    

}
.img-side{
 display:flex;
 margin-top:30px;
}
.content-serv{
text-align:justify;
margin-top:40px;
margin-left:100px;
font-size:30px;

}
.content-serv h5{

   padding:10px;

}
.img-serv{
width:50%;
height:400px;
}
.about{
display:flex;
margin-top:20px;

}

.about .v1 {
width:50px;
height:50px;
margin-left:130px;
margin-bottom:30px;

}
.vision {
width:45%;
background-color:lightgray;
margin:20px;
padding:20px;
}
.mission{
width:45%;
margin:20px;
background-color:lightgray;

}


.main-navbar{
	width:100%;
	
	height:80px;
	text-align:center;
	padding-top:20px;
}

.image-bar{
	width:100%;
	height:120px;
	text-align:center;
	padding:20px;
}
.img3
{
	width:60px;
	height:60px;
	margin:20px;
	
}
.img6
{
	width:85px;
	height:65px;
	margin:20px;
	
}
.img{
	width:50px;
	height:50px;
	margin-left:40px;
	
	margin-top:40px;
}
.content{
	display:flex;
}
.img5{
	margin-left:220px;
	width:25%;
}
.img2{
	margin-left:80px;
	width:25%;
}
.img4{
	margin-left:80px;
	width:25%;
}
</style>
</head>
<body>
   <div class="container-fluid">
   
      <div class="nav-bar">
        <div class="logo-name">
            <img src="images/hs.png" class="img1"><h2>HOSPITAL MANAGEMENT SYSTEM !!</h2>
        </div>
        <div class="nav-content">
        <ul>
        <li><a href="LoginDashBoard.jsp">Home</a></li>
        <li><a href="#about">About Us</a></li>
        <li><a href="#contact">Contact</a></li>
        <li><a href="#service">Service</a></li>
         <li><a href="Main-Login-Page.jsp">Login</a></li>
        </ul>
        
        </div>
      
      </div>
      
      <div class="content-bar">
         
        <h1>!! ...WELCOME TO HOSPITAL... !!</h1>
         <h3>We have Best Medicare plan options for you</h3>


      </div>
       <h3 id="about">
       
       </h3>
       <div class="about-page" >
      <a href="LoginDashBoard.jsp">back</a>
  <div class="container">
        <h1 style=" text-align:center;">INTRODUCTION</h1>
   
         <p style=" text-align:justify;">Hospital & Research Centre is a multispecialty tertiary care hospital in Pune, 
         providing the highest standard of clinical expertise and nursing care by offering the latest technology, 
         and state-of-the-art hospital facilities.<br>
          The Hospital focuses on rapid assessment, intervention and treatment for numerous common and complex conditions.

     Poona Hospital & Research Centre presently has 300 beds and is situated in a central location, with easy access to the City.

In addition to providing quality health care the focus is also on preventive health programmes, medical education and clinical research.<br>

Devotion to the art and science of healing reinforces every aspect of our mission.<br>
 Hospital & Research Centre is a multispecialty tertiary care hospital in Pune, 
         providing the highest standard of clinical expertise and nursing care by offering the latest technology, 
         and state-of-the-art hospital facilities.</p>
         <div class="about">
           <div class="vision">
            <img src="images/185041_target_arrow_icon.png" class="v1">
            <center><h3>Vision</h3></center><br>
             <p>To create a world-class integrated healthcare delivery system in India,entailing the finest medical skills combined with comassionate patient care.</p>
           </div>
           <div class="vision">
           <img src="images/mission-removebg-preview.png" class="v1">
            <center><h3>Mission</h3></center><br>
           <p>To create a world-class integrated healthcare delivery system in India,entailing the finest medical skills combined with comassionate patient care.</p>
        
           </div>
         </div>
  </div>
   </div>
   
    <div class="main" >
     <a href="LoginDashBoard.jsp">back</a>
    <h3 id="contact"></h3>
           <div class="main-navbar">
           <h1>Contact Us</h1>
           </div>
           
        
        <div class="content">
         <div class="img5">
         <img src="images/call-removebg-preview.png" class="img">
        <h4>+912066819999</h4>

          <h4>For appointments ( between 8am-8pm )</h4>

          <h4 >+912066819966&nbsp;&nbsp;&nbsp; +912066819967 +912066819968</h4>
         </div>
          <div class="img2">
          <img src="images/home.png" class="img">
          <h4>Jehangir Hospital 32, Sassoon Road,

             Pune - 411001, Maharashtra, India

          </h4>
          </div>
           <div class="img4">
           <img src="images/email.png" class="img">
           <h4>info@jehangirhospital.com</h4>
           </div>
        
        </div>
        <div class="image-bar">
        <img src="images/5365678_fb_facebook_facebook logo_icon.png" class="img3">
        <img src="images/4362961_linkedin_social media_icon.png" class="img3">
        <img src="images/2437730f7e3a5705e205e67fa2cd1020-removebg-preview.png" class="img6"">
        <img src="images/4102578_applications_media_social_youtube_icon.png" class="img3">
        </div>
        </div>
        
        <div class="service" >
         <a href="LoginDashBoard.jsp">back</a>
        <h3 id="service"></h3>
     
      <h1>SUPPORT SERVICES</h1>
      
      
 
      <div class="img-side">
      
      <img src="images/serv.jpg" class="img-serv">
       <img src="images/patienserv.jpg" class="img-serv"> 
      </div>
      </div>
       
     </div>
   </div>
   
   
   
   
  </body>
</html>