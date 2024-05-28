<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



<style>

@charset "UTF-8";

.icon1{
	width:30px;
	height:30px;
	margin-left:20px;
}
.table1{
	border:5px solid lightgray;
	background-color: white;
    border-collapse: collapse; 
    color:white;
    margin-left:100px;
   
}
h1{
	color:white;
}
.table1 .th1 { 
  background-color:#4DA6FF;
  color: white; 
  }
.table1 td, 
.table1 .th1 { 
  border: 1px solid black; 
  width:100px;
  padding:4px;
  
  }

  .table1 td{
  color:black;
  width:10px;
  

  }

</style>
<script type='text/javascript'>
    function searchByName(){
    	let str = document.getElementById("s").value;
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","SearchDoctorByName.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
</head>
<body>
<%@include file="AdminDashBoard.jsp" %>
<div class="col-md-8 content">
<center>
			<input type='text' name='name' value='' id="s"
				style='width: 20%; height:30px; margin-top: 20px;'
				placeholder="search" onkeyup="searchByName()" /> <a href="AddDoctor.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white; height:30px; margin-bottom:5px;">Add New</button></a></center> 
				
				<br>
<div id="d">
  <table class="table1">
 
  <thead>
  <tr>

 <th scope="col" class="th1">Doctor Id</th>
  <th scope="col"  class="th1">name</th> 
  <th scope="col"  class="th1">Specialization</th>
    <th scope="col"  class="th1">contact</th>
     <th scope="col"  class="th1">Email</th>
     <th scope="col"  class="th1">Schedule</th>
      <th scope="col"  class="th1">Catgory</th>
  <th scope="col"  class="th1">Delete</th>
 
  </tr>
  </thead>
 <tbody>
  <%
  DoctorService ds=new DoctorServiceIMPL();
  List<DoctorModel> list=ds.getAllDoctor();
  int count=0;
  for(DoctorModel d:list)
   {
	 %>
	   <tr>
	   
	   <td><a href='updDoctor?did=<%=d.getDid()%>&name=<%=d.getName()%>&contact=<%=d.getContact()%>&specialization=<%=d.getSpecialization()%>&email=<%=d.getEmail()%>&schedule=<%=d.getSchedule()%>&category=<%=d.getCategory()%>'><%=d.getDid() %></a></td>
	   <td class="1"><%=d.getName()%></td>
	   <td class="1"><%=d.getSpecialization()%></td>
	   <td class="1"><%=d.getContact() %></td>
	   <td class="1"><%=d.getEmail() %></td>
	   <td class="1"><%=d.getSchedule() %></td>
	   <td class="1"><%=d.getCategory() %></td>
	   
	   
	   <td class="1"><a href='DelDoct?did=<%=d.getDid()%>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
	   
	 <!-- <td><a href='updDoct?did=<%=d.getDid() %>&name=<%=d.getName()%>&contact=<%=d.getContact()%>&specialization=<%=d.getSpecialization()%>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>  --> 
	   </tr>
	 <%  
   }
  
  %>
  </tbody>
  </table>
  
  
</div>
</div>
</div>

 <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>