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
    margin-left:130px;
    
   
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
  width:80px;
  
  
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
		xhttp.open("GET", "SearchBillByName.jsp?n=" + str, true)
		xhttp.send();
	}
</script>
<body>
	<%@include file="ReceptionistDashBoard.jsp"%>

	<div class="col-md-8 content">
		<center>
			<input type='text' name='name' value='' id="s"
				style='width: 20%; height: 30px; margin-top: 20px;'
				placeholder="search" onkeyup="searchByName()" /> <a href="ViewPatient.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white; height:30px; margin-bottom:5px;">Add New</button></a><br></center>
			<br>
			<div id="d">

				<table class="table1">

					<thead>
						<tr>
						    <th scope="col" class="th1">Sr No.</th>
							<th scope="col" class="th1">Patient Id</th>
							<th scope="col" class="th1">Patient Name</th>
							<th scope="col" class="th1">Bill Date</th>
							<th scope="col" class="th1">Bill Time</th>
							<th scope="col" class="th1">Doctor Fee</th>
							<th scope="col" class="th1">Room Cost</th>
							<th scope="col" class="th1">Total</th>
							<th scope="col" class="th1">Delete</th>
				
						</tr>

					</thead>
					<tbody>
						<%!BillService bs = new BillServiceIMPL();%>
						<%
						List<Object[]> list = bs.getAllBill();
						int count = 0;
						for (Object obj[] : list) {
						%>
						<tr>
							<td scope="row"><%=++count%></td>
							<td><a
								href='updatejsp.jsp?pid=<%=obj[0]%>&Billdate=<%=obj[2]%>&Billtime=<%=obj[3]%>&Doctorfee=<%=obj[4]%>&Roomcost=<%=obj[5]%>&total=<%=obj[6]%>'><%=obj[0]%></td>
							<td><%=obj[1]%></td>
							<td><%=obj[2]%></td>
							<td><%=obj[3]%></td>
							<td><%=obj[4]%></td>
							<td><%=obj[5]%></td>
							<td><%=obj[6]%></td>
							
							
							<td><a href='DelBill?billid=<%=obj[0]%>'><ion-icon
										name="close-circle-outline" class="icon1"></ion-icon></a></td>

							
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