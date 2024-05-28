<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page
	import="org.hospital.admin.model.*,org.hospital.admin.service.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/View-doctor.css" rel="stylesheet">
<style>
h2{
color:blue;
text-align:center;
padding-top:20px;


}

</style>
</head>
<body>
<%@include file="DoctorDashboard.jsp"%>

	<div class="col-md-8 content">
	<h2>Prescription</h2>
		
				<table class="table">

					<thead>
						<tr>
						    <th scope="col" class="th">Sr No.</th>
							<th scope="col" class="th">Patient Name</th>
							<th scope="col" class="th">Doctor Name</th>
							<th scope="col" class="th">Medicine Name</th>
							<th scope="col" class="th">Delete</th>
							<th scope="col" class="th">Update</th>
						</tr>

					</thead>
					<tbody>
						<%!PrescriptionService ps = new PrescriptionServiceIMPL();%>
						<%
						List<Object[]> list = ps.getAllPrescription();
						int count = 0;
						for (Object obj[] : list) {
						%>
						<tr>
							<td scope="row"><%=++count%></td>
							<td><%=obj[0]%></td>
							<td><%=obj[1]%></td>
							<td><%=obj[2]%></td>
							
							
							
							<td><a href='DelPrescription?billid=<%=obj[0]%>'><ion-icon
										name="close-circle-outline" class="icon1"></ion-icon></a></td>

							<td><a
								href='BillUpd?billid=<%=obj[0]%>&medicine=<%=obj[2]%>'><ion-icon
										name="sync-outline" class="icon1"></ion-icon></a></td>
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