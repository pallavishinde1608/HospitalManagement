<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="CSS/Admin-style.css" rel="stylesheet">
 <style>
 *{
	margin:0px;
	padding:0px;
	box-sizing:border-box;
	
}
.mycontainer{
	
	width:100%;
	min-height:500px;
	color:white;
}
.nav-bar 
{
	background-color:#4DA6FF;
	display:flex;
}
.nav-img{
	width:60%;
	height:80px;
	
	
}




.content{
	width:80%;
	min-height:40px;
	
}
.content h1{
	margin-left:300px;
	margin-top:20px;
	font-size:50px;
}
 
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
 h2{
 color:black;
 text-align:center;
 margin-top:40px;
 }
 .img1
{
	width:70px;
	height:70px;
	margin-top:10px;
	margin-left:5px;
	
}


.icon1{
	width:30px;
	height:30px;
	margin-left:20px;
}
.table{
	border:5px solid lightgray;
	background-color: white;
    border-collapse: collapse; 
    color:white;
    width:900px;
    margin-left:200px;
}
h1{
	color:white;
}
.table .th { 
  background-color:#4DA6FF;
  color: white; 
  }
.table td, 
.table th { 
  border: 1px solid black; 
  padding:10px;
  
  
  }

  .table td{
  color:black;
  }
  button{
  width:80px;
  height:40px;
  margin-left:500px;
  margin-top:20px;
  }
</style>
</head>
<body>
 <div class="container-fluid mycontainer">
     <div class="row nav-bar">
       <div class="col-md-12 nav-img">   
        <img src="<%="images/hs.png"%> " class="img1"><h1>Hospital Management System</h1>
        
       </div>
        <a href="LoginDashBoard.jsp?p=" onclick=""; return false;">
        <button src="LoginDashBoard.jsp">Logout</button></a>
        
      
       
       
     </div>
     
     <h2>Patient Details</h2>
<%!
List<Object[]> pmodel;

%>
<%
int did=Integer.parseInt(session.getAttribute("did").toString());
out.println("<h1>Hey your id is "+did+"</h1>");
PrescriptionService ps=new PrescriptionServiceIMPL();
pmodel=ps.getDoctorLoginPatient(did);
%>


<div class="col-md-8 content">
  <table class="table">
  <thead>
  <tr>
      <th scope="col"  class="th">Sr.No</th> 
     <th scope="col"  class="th">Patient Name</th> 
     <th scope="col"  class="th">contact</th>
     <th scope="col"  class="th">Age</th>
     <th scope="col"  class="th">Gender</th>

     <th scope="col"  class="th">Category</th>
     <th scope="col"  class="th">AdmitDate</th>
     <th scope="col"  class="th">Type</th>
     <th scope="col"  class="th">Medicine Name</th>
    <th scope="col" class="th">Add Medicine</th>
     
 
  </tr>
  </thead>
  <tbody>

	   <tr>
	   
	    <%
        int count = 0;
          
						for (Object obj[] :pmodel) {
						%>
						<tr>
							<td scope="row"><%=++count%></td>
							<td><%=obj[0]%></td>
							<td><%=obj[1]%></td>
							<td><%=obj[2]%></td>
							<td><%=obj[3]%></td>
							<td><%=obj[4]%></td>
							<td><%=obj[5]%></td>
							<td><%=obj[6]%></td>
							<td><a href='updMedicine?pid=<%=obj[8]%>&medicine=<%=obj[7]%>'><%=obj[7]%></a></td>
							<td><a href='AllocateMedicine?pid=<%=obj[8]%>&did=<%=obj[9]%>'>Add Medicine</a></td>
							
							
						</tr>
						<%
						}
           %>
	      </tr>
	</tbody>
  
 

 
</table>
</div>
</div>
</div>
 <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>