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
 * Servlet implementation class UpdateMEdicine
 */
@WebServlet("/updMedicine")
public class UpdateMEdicine extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String  medicine=request.getParameter("medicine");
		RequestDispatcher r=request.getRequestDispatcher("ViewSerachDoctor.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Upd-Patient.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formarea' name='frm' action='FinalUpdmedicine' method='Post' style='margin-left:300px;width:400px;'>");
		out.println("<h1>Update Medicine</h1>");
		out.println("<input type='hidden' value='"+pid+"' class='form-control1 control1' name='pid'>");
		out.println(" <lable for='patient' style='margin-left:15px;'>Medicine Name :</lable>");
		out.println("<input type='text'  value='"+medicine+"' class='form-control1 control1' name='medicine' style='width:220px;' placeholder='Enter doctor name'><br><br>");
		out.println("<button type='submit' name='s' class='btn bg-primary' style='color:white;margin:5px; padding:10px;background-color:gray;border:none;'>Update medicine</button>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
