<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*"%>
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
  padding:2px;
  
  }

  .table1 td{
  color:black;
  width:10px;
  

  }

</style>
</head>
<script type='text/javascript'>
	function searchByName() {
		let str = document.getElementById("s").value;
		let xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("d").innerHTML = this.responseText;
			}
		};
		xhttp.open("GET", "SearchPatientByName.jsp?n=" + str, true)
		xhttp.send();
	}
</script>
<body>
	<%@include file="ReceptionistDashBoard.jsp"%>
  
	<div class="col-md-8 content">
		<center>
			<input type='text' name='name' value='' id="s"
				style='width: 20%; height:30px; margin-top: 20px;'
				placeholder="search" onkeyup="searchByName()" /> <a href="AddPatient.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white; height:30px; margin-bottom:5px;">Add New</button></a></center>
			<br>
			<div id="d">

				<table class="table1">

					<thead>
						<tr>
							<th scope="col" class="th1">Patient Id</th>
							<th scope="col" class="th1">name</th>
							<th scope="col" class="th1">contact</th>
							<th scope="col" class="th1">Address</th>
							<th scope="col" class="th1">Age</th>
							<th scope="col" class="th1">Gender</th>
							<th scope="col" class="th1">Category</th>
							<th scope="col" class="th1">Email</th>
							<th scope="col" class="th1">Admit Date</th>
							<th scope="col" class="th1">Doctor Name</th>
							<th scope="col" class="th1">Patient Type</th>
							<th scope="col" class="th1">Patient Status</th>
							<th scope="col" class="th1">Add Medicine</th>
							<th scope="col" class="th1">Add Bill</th>
							<th scope="col" class="th1">Delete</th>
							
						</tr>

					</thead>
					<tbody>
						<%!PatientService ps = new PatientServiceIMPL();%>
						<%
						List<Object[]> list = ps.getAllPatient();
						int count = 0;
						
						for (Object obj[] : list) {
						%>
						System.out.println(list.size());
						<tr>
							
							<td><a href='updPatient?pid=<%=obj[11]%>&name=<%=obj[0]%>&address=<%=obj[1]%>&contact=<%=obj[2]%>&age=<%=obj[3]%>&gender=<%=obj[4]%>&category=<%=obj[5]%>&email=<%=obj[6]%>&date=<%=obj[7]%>&type=<%=obj[9]%>&status=<%=obj[10]%>'><%=obj[11]%></a></td>
							<td><%=obj[0]%></td>
							<td><%=obj[1]%></td>
							<td><%=obj[2]%></td>
							<td><%=obj[3]%></td>
							<td><%=obj[4]%></td>
							<td><%=obj[5]%></td>
							<td><%=obj[6]%></td>
							<td><%=obj[7]%></td>
							<td><%=obj[8]%></td>
							<td><%=obj[9]%></td>
							<td><%=obj[10]%></td>
							<td><a href='AddMedicine?pid=<%=obj[11]%>&did=<%=obj[12]%>'>Add Medicine</a></td>
							<td><a href='IPDBill.jsp?pid=<%=obj[11]%>'>Add Bill</a></td>
							<td><a href='DelPatient?pid=<%=obj[11]%>'><ion-icon name="close-circle-outline" class="icon1"></ion-icon></a></td>

							
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
	</div>

	<script type="module"
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
	<script nomodule
		src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>