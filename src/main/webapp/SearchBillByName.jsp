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
.table{
	border:5px solid lightgray;
	background-color: white;
    border-collapse: collapse; 
    color:white;
}
h1{
	color:white;
}
.table th { 
  background-color:#4DA6FF;
  color: white; 
  }
.table td, 
.table th { 
  border: 1px solid black; 
  padding-left:30px;
   padding-right:26px;
  
  }

  .table td{
  color:black;}





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
 
	stmt=conn.prepareStatement(" select p.patientid,p.pname,b.billdate,b.billtime,b.doctorfee,b.roomcost,b.total,b.billid from bill b  inner join patient p on b.patientid=p.patientid where  p.pname like '%"+name+"%'");
	rs=stmt.executeQuery();
	out.println("<div class='col-md-8 content'>");
	out.println("<table class='table'>");
	out.println("<tr style='color:black;'><th>Sr No.</th><th>Patient Id</th><th>NAME</th><th>Bill Date</th><th>Bill Time</<th><th>Doctor Fee</th><th>Room Cost</th><th>Total</th><th>Delete</th><th>Update</th></tr>");
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+(++count)+"</td>");
		out.println("<td>"+rs.getInt(1)+"</td>");
		out.println("<td>"+rs.getString(2)+"</td>");
		out.println("<td>"+rs.getString(3)+"</td>");
		out.println("<td>"+rs.getString(4)+"</td>");
		out.println("<td>"+rs.getInt(5)+"</td>");
		out.println("<td>"+rs.getInt(6)+"</td>");
		out.println("<td>"+rs.getInt(7)+"</td>");
		
		out.println("<td><a href='DelBill?billid="+rs.getInt(8)+"'><ion-icon name='close-circle-outline' class='icon1'></ion-icon></a></td>");   
		out.println("<td><a href='BillUpd?billid="+rs.getInt(8)+"&Billdate="+rs.getString(3)+"&Billtime="+rs.getString(4)+"&Doctorfee="+rs.getInt(5)+"&Roomcost="+rs.getInt(6)+"&total="+rs.getInt(7)+"'><ion-icon name='sync-outline' class='icon1'></ion-icon></a></td>");
		 
		
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