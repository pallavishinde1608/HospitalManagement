package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateAdminRecep
 */
@WebServlet("/updDoctor")
public class UpdateAdminRecep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int did=Integer.parseInt(request.getParameter("did"));
		String  name=request.getParameter("name");
		String specialization=request.getParameter("specialization");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String schedule=request.getParameter("schedule");
		String category=request.getParameter("category");
		  
		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Upd-Doctor.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println("<form class='formarea' name='frm' action='FinalUpdAdmin' method='Post'>");
		out.println("<h3>Update Doctor</h3>");
		out.println("<input type='hidden' value='"+did+"' class='form-control c' name='did'>");
		out.println("<label for='doctorcode'>Doctor Name :</label>");
		out.println("<input type='text' value='"+name+"' class='form-control1 control1' style='width:200px;' name='name' placeholder='enter doctor name'>");
		out.println("<label for='doctorcode'>Specialization :</label>");
		out.println("<input type='text' value='"+specialization+"' class='form-control1 control1' style='width:200px;' name='specialization' placeholder='Enter doctor specialization'>");
		out.println("<label for='doctorcode'>Doctor Contact :</label>");
		out.println("<input type='text' value='"+contact+"' class='form-control1 control1'  style='width:200px;' name='contact'  placeholder='Enter doctor contact'>");
		out.println("<label for='doctorcode'>Doctor Email :</label>");
		out.println("<input type='text' value='"+email+"' class='form-control1 control1'  style='width:200px;' name='email'  placeholder='Enter doctor contact'>");
		out.println("<label for='doctorcode'>Doctor Schedule :</label>");
		out.println("<input type='text' value='"+schedule+"' class='form-control1 control1'  style='width:200px;' name='schedule'  placeholder='Enter doctor contact'>");
		out.println("<label for='doctorcode'>Doctor Category :</label>");
		out.println("<input type='text' value='"+category+"' class='form-control1 control1'  style='width:200px;' name='category'  placeholder='Enter doctor contact'>");
		
		out.println("<br><button type='submit' name='s' class='btn bg-primary' style='color:white;'>save</button>");
		out.println("</div></div></div>");	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
