<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
    margin-left:220px;
   
}
.table1 h1{
	color:black;
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
</head>
<body>
<%@include file="AdminDashBoard.jsp" %>

<div class="col-md-8 content">
<center>
<input type='text' name='name' value='' id="s"
				style='width: 20%; height:30px; margin-top:40px;margin-bottom:20px;'
				placeholder="search" onkeyup="searchByName()" />
 <a href="AddRecep.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white; height:30px; margin-bottom:5px;">Add New</button></a></center>
  
  <table class="table1">
 
  <thead>
  <tr>
 
 <th scope="col"  class="th1">Recep Id</th> 
  <th scope="col"  class="th1">name</th> 
   <th scope="col"  class="th1">email</th> 
     <th scope="col"  class="th1">contact</th> 
  <th scope="col"  class="th1">Delete</th>
  
  </tr>
  
  </thead>
 <tbody>
  <%
  RecepService rs=new RecepServiceIMPL();
  List<RecepModel> list=rs.getAllRecep();
  int count=0;
  for(RecepModel r:list)
   {
	 %>
	   <tr>
	   
	   <td class="td"><a href='updRecep?rid=<%=r.getRid() %>&name=<%=r.getName()%>&email=<%=r.getEmail()%>&contact=<%=r.getContact()%>'><%=r.getRid()%></a></td>
	   <td class="td"><%=r.getName()%></td>
	   <td class="td"><%=r.getEmail()%></td>
	   <td class="td"><%=r.getContact()%></td>
	   
	   <td class="td"><a href='DelRecep?rid=<%=r.getRid()%>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>
	   
	  <!-- <td class="td"><a href='updRecep?rid=<%=r.getRid() %>&name=<%=r.getName()%>'><ion-icon name="sync-outline" class="icon1"></ion-icon></a></td>
	   -->  </tr>
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