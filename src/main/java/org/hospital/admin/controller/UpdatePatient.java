package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updPatient")
public class UpdatePatient extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String  name=request.getParameter("name");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
	    int age=Integer.parseInt(request.getParameter("age"));
	    String gender=request.getParameter("gender");
	    String category=request.getParameter("category");
	    String email=request.getParameter("email");
	    String date=request.getParameter("date");
	    String type=request.getParameter("type");
	    String status=request.getParameter("status");
		RequestDispatcher r=request.getRequestDispatcher("ReceptionistDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Upd-Patient.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formarea' name='frm' action='FinalUpdP' method='Post'>");
		out.println("<h1>Update Patient</h1>");
		out.println("<input type='hidden' value='"+pid+"' class='form-control1 control1' name='pid'>");
		out.println(" <lable for='patient' style='margin-left:15px;'>Patient Name :</lable>");
		out.println("<input type='text'  value='"+name+"' class='form-control1 control1' name='name' style='width:220px;' placeholder='Enter doctor name'>");
		out.println(" <lable for='patient' style='margin-left:5px;'>Patient Contact :</lable>");
		out.println("<input type='text' value='"+contact+"' class='form-control1 control1' name='contact' style='width:220px;' placeholder='Enter patient contact'>");
		out.println(" <lable for='patient'>Patient Address :</lable>");
		out.println("<input type='text' value='"+address+"' class='form-control1 control1' name='address' style='width:220px;'  placeholder='Enter patient address'>");
		out.println(" <lable for='patient' style='margin-left:32px;'>Patient Age :</lable>");
		out.println("<input type='text' value='"+age+"' class='form-control1 control1' name='age' style='width:220px;' placeholder='Enter doctor name'>");
		out.println(" <lable for='patient'  style='margin-left:6px;'>Patient Gender :</lable>");
		out.println("<input type='text' value='"+gender+"' class='form-control1 control1' name='gender'  style='width:220px;' placeholder='Enter patient contact'>");
		out.println(" <lable for='patient'>Patient Category :</lable>");
		out.println("<input type='text' value='"+category+"' class='form-control1 control1' name='category' style='width:220px;' placeholder='Enter patient address'>");
		out.println(" <lable for='patient' style='margin-left:18px;'>Patient Email :</lable>");
		out.println("<input type='text' value='"+email+"' class='form-control1 control1' name='email' style='width:220px;' placeholder='Enter doctor name'>");
		out.println(" <lable for='patient' style='margin-left:34px;'>Patient Date :</lable>");
		out.println("<input type='text' value='"+date+"' class='form-control1 control1' name='date' style='width:220px;' placeholder='Enter patient contact'>");
		out.println(" <lable for='patient' style='margin-left:24px;'>Patient Type :</lable>");
		out.println("<input type='text' value='"+type+"' class='form-control1 control1' name='type' style='width:220px;'  placeholder='Enter patient address'>");
		out.println(" <lable for='patient' style='margin-left:20px;'>Patient Status :</lable>");
		out.println("<select class='form-control1 control1' name='status'  value='"+status+"' id='machinecode' style='width:220px;padding:5px;' >");
		out.println(" <option>Active</option>");
		out.println(" <option>Inactive</option>");
		out.println(" </select>");
		out.println("<button type='submit' name='s' class='btn bg-secondary' style='color:white;margin:5px;'>Update Patient</button>");
		out.println("</div></div></div>");	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
