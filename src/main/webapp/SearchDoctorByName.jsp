<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@page import="java.sql.*,java.util.*" %>
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
    margin-left:100px;
   
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
  padding:4px;
  
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
 
	stmt=conn.prepareStatement("select *from doctor where dname like '%"+name+"%'");
	rs=stmt.executeQuery();
	out.println("<div class='col-md-8 content'>");
	out.println("<table class='table1'>");
	out.println("<tr><th>Doctor Id</th><th>NAME</th><th>Specialization</<th><th>Contact</th><th>email</th><th>Schedule</th><th>Category</th><th>Delete</th><th>Update</th></tr>");
	while(rs.next()){
		out.println("<tr>");
		
		out.println("<td><a href='updDoct?did="+rs.getInt(1)+"&name="+rs.getString(2)+"&contact="+rs.getString(4)+"&specialization="+rs.getString(3)+"&email="+rs.getString(5)+"&schedule="+rs.getString(6)+"&category="+rs.getString(7)+"'>"+rs.getInt(1)+"</a></td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getString(4)+"</td>");
		out.println("<td>"+rs.getString(5)+"</td>");
		out.println("<td>"+rs.getString(6)+"</td>");
		out.println("<td>"+rs.getString(7)+"</td>");
		out.println("<td><a href='DelDoct?did="+rs.getInt(1)+"'><ion-icon name='close-circle-outline' class='icon1'></ion-icon></a></td>");   
		out.println(" <td><a href='updDoct?did="+rs.getInt(1)+"&name="+rs.getString(2)+"&contact="+rs.getString(3)+"&specialization="+rs.getString(4)+"'><ion-icon name='sync-outline' class='icon1'></ion-icon></a></td>");
		 
		 
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