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
 * Servlet implementation class UpdateRecep
 */
@WebServlet("/updRecep")
public class UpdateRecep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int rid=Integer.parseInt(request.getParameter("rid"));
		String  name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Upd-Patient.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formarea' name='frm' action='FinalUpdRecep' method='Post'>");
		out.println("<h1>Update Receptionist</h1>");
		out.println("<input type='hidden' value='"+rid+"' class='form-control1 control1' name='rid'>");
		out.println(" <lable for='patient' style='margin-left:15px;'>Recep Name :</lable>");
		out.println("<input type='text'  value='"+name+"' class='form-control1 control1' name='name' style='width:220px;' placeholder='Enter doctor name'>");
		out.println(" <lable for='patient' style='margin-left:5px;'>Recep Email :</lable>");
		out.println("<input type='text' value='"+email+"' class='form-control1 control1' name='email' style='width:220px;' placeholder='Enter patient contact'><br>");
		out.println(" <lable for='patient'>Recep Contact :</lable>");
		out.println("<input type='text' value='"+contact+"' class='form-control1 control1' name='contact' style='width:220px;'  placeholder='Enter patient address'><br>");
		out.println("<button type='submit' name='s' class='btn bg-secondary' style='color:white;margin:5px;background-color:gray;'>Update Receptionist</button>");
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
