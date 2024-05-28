<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Login-Dash-Board.css" rel="stylesheet">
<link href="CSS/About-page.css" rel="stylesheet">
 <script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","?n="+str,true)
    	xhttp.send();
    }
 </script>


</head>
<body>
<div class="container-fluid">
   
      <div class="nav-bar">
        <div class="logo-name">
            <img src="images/hs.png" class="img1"><h2>HOSPITAL MANAGEMENT SYSTEM!!</h2>
        </div>
        <div class="nav-content">
        <ul>
        <li><a href="LoginDashBoard.jsp">Home</a></li>
        <li><a href="AboutUs.jsp">About Us</a></li>
        <li><a href="ContactUs.html">Contact</a></li>
        <li><a href="ServicePAge.jsp">Service</a></li>
         <li><a href="Main-Login-Page.jsp">Login</a></li>
        
        </ul>
        
        </div>
       </div>
        <div class="about-page">
  <div class="container">
 <%!
   Connection conn;
   PreparedStatement stmt;
   ResultSet rs;
 %>
 <%
   Class.forName("com.mysql.cj.jdbc.Driver");
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hopitalmanagementsystem","root","pallavi");
 if(conn!=null){
	 stmt=conn.prepareStatement("select *from patient");
	 rs=stmt.executeQuery();
%>
<center><input type='text' name='name' value='' style='width:90%;height:50px;' onkeyup="searchByName(this.value)"/></center>
<br><br>
<div id="d">
 <table border='5' align='center' width='60%'>
  <tr>
   <th scope="col" class="th">Patient Id</th>
    <th scope="col"  class="th">name</th> 
     <th scope="col"  class="th">Address</th>
    <th scope="col"  class="th">contact</th>
     <th scope="col"  class="th">Age</th>
    <th scope="col"  class="th">Gender</th>
    <th scope="col"  class="th">Category</th>
    <th scope="col"  class="th">Email</th>
     <th scope="col"  class="th">Admit Date</th>
   <!--   <th scope="col"  class="th">Doctor Name</th>
   <th scope="col"  class="th">Delete</th>
    <th scope="col"  class="th">Update</th> --> 
  </tr>
 <% 
	 while(rs.next()){
 %>
	 <tr>
	  <td><%=rs.getInt(1)%></td>
	  <td><%=rs.getString(2)%></td>
	  <td><%=rs.getString(3)%></td>
	  <td><%=rs.getString(4)%></td>
	  <td><%=rs.getInt(5)%></td>
	   <td><%=rs.getString(6)%></td>
	   <td><%=rs.getString(7)%></td>
	   <td><%=rs.getString(8)%></td>
	   <td><%=rs.getString(9)%></td>
	 
	  
	 </tr>
	<%	 
	 }
  %>
  </table>
  <% 
 }
 else{
	 out.println("<h1>Database is not connected</h1>");
 }
 
 %>
 </div>
</div>
</div>

</body>
</html>