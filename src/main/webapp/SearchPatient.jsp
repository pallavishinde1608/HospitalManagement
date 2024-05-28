<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="CSS/Doctor-form.css" rel="stylesheet">
 <script type='text/javascript'>
    function searchByName(str){
    	let xhttp=new XMLHttpRequest();
    	xhttp.onreadystatechange=function(){
    		 if(this.readyState==4 && this.status==200){
    			 document.getElementById("d").innerHTML=this.responseText;
    		 }
    	};
    	xhttp.open("GET","searchbyname.jsp?n="+str,true)
    	xhttp.send();
    }
 </script>
</head>

<body>
<%@include file="AdminDashBoard.jsp" %>

<div class="col-md-8 content">

  <form class="formarea" name="frm" action="searchPatient" method="Post">
  <div class="form-group ">
  <lable for="doctorcode">Patient Name</lable><br>
  <input type="text"class="form-control control" name="name" id="machinecode" placeholder="enter patient name"onkeyup="searchByName(this.value)"><br>
   <button type="submit" class="btn bg-primary" >Submit</button><br>
  
  </div>
  </form>
  </div>
  </div>
  </div>
</body>
</html>