<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@page import="java.sql.*,java.util.*" %>
<link href="CSS/View-doctor.css" rel="stylesheet">
<style>
@charset "UTF-8";
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
    
   
}
h1{
	color:white;
}
.table1 th { 
  background-color:#4DA6FF;
  color: white; 
  }
.table1 td, 
.table1 th { 
  border: 1px solid black; 
  width:100px;
  padding:2px;
  
  }

  .table1 td{
  color:black;
  width:10px;
  

  }
</style>
</head>
<body>

<%!
 Connection conn;
 PreparedStatement stmt;
 ResultSet rs;
 List<Object[]> list;
%>
<%
try {
	int count=0;
 String name=request.getParameter("n");
 Class.forName("com.mysql.cj.jdbc.Driver");
 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hopitalmanagementsystem", "root","pallavi");
 list=new ArrayList<Object[]>();
 
	stmt=conn.prepareStatement(" select p.pname,p.contact,p.address,p.age,p.gender,p.category,p.email,p.pdate,d.dname,p.type,p.status,p.patientid,d.did from Patient p inner join doctorpatientjoin dpj on p.patientid=dpj.patientid inner join doctor d on d.did=dpj.did where  p.pname like '%"+name+"%' or p.pdate like '%"+name+"%' or p.category like '%"+name+"%' or p.status like '%"+name+"%' or d.dname like '%"+name+"%' or year(p.pdate) like '%"+name+"%' or day(p.pdate) like '%"+name+"%' or month(p.pdate) like '%"+name+"%'");
	rs=stmt.executeQuery();
	out.println("<div class='col-md-8 content'>");
	out.println("<table class='table1'>");
	out.println("<tr style='color:black;'><th>Patient Code</th><th>NAME</th><th>Contact</th><th>Address</<th><th>Age</th><th>Gender</th><th>Category</th><th>email</th><th>Admit Date</th><th>Doctor Name</th><th>type</th><th>Status</th><th>Allocate Medicine</th><th>Add Bill</th><th>Delete</th></tr>");
	while(rs.next()){
		out.println("<tr>");
		
		out.println("<td><a href='updPatient?pid="+rs.getInt(12)+"&name="+rs.getString(1)+"&address="+rs.getString(2)+"&contact="+rs.getString(3)+"&age="+rs.getInt(4)+"&gender="+rs.getString(4)+"&category="+rs.getString(5)+"&email="+rs.getString(6)+"&date="+rs.getString(7)+"&type="+rs.getString(8)+"&status="+rs.getString(9)+"'>"+rs.getInt(12)+"</a></td>");
		out.println("<td>"+rs.getString(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getInt(4)+"</td>");
		out.println("<td>"+rs.getString(5)+"</td>");
		out.println("<td>"+rs.getString(6)+"</td>");
		out.println("<td>"+rs.getString(7)+"</td>");
		out.println("<td>"+rs.getString(8)+"</td>");
		out.println("<td>"+rs.getString(9)+"</td>");
		out.println("<td>"+rs.getString(10)+"</td>");
		out.println("<td>"+rs.getString(11)+"</td>");
		out.println("<td><a href='AllocateMedicine?pid="+rs.getInt(12)+"&did="+rs.getInt(13)+"'>Add Medicine</a></td>");
		out.println("<td><a href='IPDBill.jsp?pid="+rs.getInt(12)+"'>Add Bill</a></td>");
		out.println("<td><a href='DelPatient?pid="+rs.getInt(12)+"'><ion-icon name='close-circle-outline' class='icon1'></ion-icon></a></td>");   
		
		
		out.println("</tr>");
	}
	out.println("</table>");
	out.println("</div>");
	
}
 catch(Exception ex)
 {
	 System.out.println("error is"+ex);
 }
 
 
%>
</body>
</html>