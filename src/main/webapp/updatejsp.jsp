<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
@charset "UTF-8";
lable{
color:black;
width:150px;
font-size:17px;
}

input{
padding:px;


}

.content h3{
color:white;
margin-top:10px;

}
.formarea{
  margin:50px;
  background-color:#4DA6FF;
  border:2px solid gray;
  box-shadow: 10px 10px gray;
  padding:10px;
  width:680px;
}
.control1{
margin-bottom:10px;
margin-top:10px;
}

</style>

</head>
<body>
<script>
function set()
{
	    var doctorFee=parseInt(document.getElementById("fee").value);
	    var roomcost=parseInt(document.getElementById("cost").value);
	    var result=doctorFee+roomcost;
	    document.getElementById("result").value = result;
}
</script>
<%!
int pid;
String billdate;
String billtime;
int doctorfee;
int roomcost;
int total;
%>
<% 

pid=Integer.parseInt(request.getParameter("pid"));
billdate=request.getParameter("Billdate");
 billtime=request.getParameter("Billtime");
 doctorfee=Integer.parseInt(request.getParameter("Doctorfee"));
roomcost=Integer.parseInt(request.getParameter("Roomcost"));
total=Integer.parseInt(request.getParameter("total"));

%>
<%@include file="ReceptionistDashBoard.jsp" %>
<div class="col-md-8 content">
<form class="formarea" name="frm" action="FinalupdBill" method="Post">
  <div class="form-group ">
   
  
   
   <lable for="doctorcode" style="margin-left:13px;">Patient Id</lable>
  <input type="text"class="form-control1 control1" name="pid"  value=<%=pid%> id="pid"  style="width:220px;" placeholder="enter patient id">
 
  <lable for="doctorcode" style="margin-left:27px;">Bill Date</lable>
  <input type="date"class="form-control1 control1" name="billdate"  value=<%=billdate%> id="date" style="width:220px;" >
  
  <lable for="doctorcode" style="margin-left:19px;">Bill Time</lable>
  <input type="time"class="form-control1 control1" name="billtime" value=<%=billtime%> id="time" style="width:220px;">
  
   <lable for="doctorcode">Doctor Fees</lable>
   <input type="text"class="form-control1 control1" name="doctorfee" value=<%=doctorfee%> id="fee" style="width:220px;">
  
   <lable for="doctorcode">Room Cost</lable>
  <input type="text"class="form-control1 control1" name="roomcost" value=<%=roomcost%>  id="cost"  style="width:220px;">
  
    <lable for="doctorcode" style="margin-left:54px;">Total</lable>
  <input type="text"class="form-control1 control1" name="total" value=<%=total%> id="result" style="width:220px;" onclick="set()" readonly>
  
   
 
   
  </div>
  <button type="submit" class="btn bg-secondary" style="color:white;">Submit</button><br>
   
   </form>
   </div>
   </div>
  </div>
</body>
</html>