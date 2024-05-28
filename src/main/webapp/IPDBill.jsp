<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Doctor-form.css" rel="stylesheet">
<script type="text/javascript">
  function calBill()
  {
	    var doctorFee=parseInt(document.getElementById("fee").value);
	    var roomcost=parseInt(document.getElementById("cost").value);
	    var result=doctorFee+roomcost;
	    document.getElementById("result").value = result;
  }
  
</script>


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
  width:660px;
}
.control1{
margin-bottom:10px;
margin-top:10px;
}

</style>

</head>
<body>

<%@include file="ReceptionistDashBoard.jsp" %>
<%!


int pid;

%>
<% 

 

 pid=Integer.parseInt(request.getParameter("pid"));


%>
<div class="col-md-8 content">

   <form class="formarea" name="frm" action="Bill" method="Post">
  <div class="form-group ">
   
   <lable for="doctorcode" style="margin-left:13px;">Patient Id</lable>
  <input type="text"class="form-control1 control1" name="pid" id="pid" value=<%=pid%> style="width:220px;" placeholder="enter patient id">
 
  <lable for="doctorcode" style="margin-left:27px;">Bill Date</lable>
  <input type="date"class="form-control1 control1" name="date" id="date" style="width:220px;" placeholder="">
  
  <lable for="doctorcode" style="margin-left:19px;">Bill Time</lable>
  <input type="time"class="form-control1 control1" name="time" id="time" style="width:220px;" placeholder="">
  
   <lable for="doctorcode">Doctor Fees</lable>
   <input type="text"class="form-control1 control1" name="fee" id="fee" style="width:220px;" placeholder="enter doctor Fees">
  
   <lable for="doctorcode">Room Cost</lable>
  <input type="text"class="form-control1 control1" name="cost" id="cost"  style="width:220px;" placeholder="enter room cost ">
  
    <lable for="doctorcode" style="margin-left:54px;">Total</lable>
  <input type="text"class="form-control1 control1" name="total" id="result" style="width:220px;" onclick="calBill()" readonly>
  
   
 
  <button type="submit" class="btn bg-secondary" style="color:white;">Submit</button><br>
   
   </form>
          
       </div>
       
       <a href="ViewBill.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;margin-left:30px;">Result</button></a>
   <a href="IPDBill.jsp?p=" onclick=""; return false;">
  <button type="submit" class="btn bg-secondary" style="color:white;">Add New</button></a> 
  

</body>
</html>