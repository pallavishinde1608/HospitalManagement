package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hospital.admin.model.RecepModel;
import org.hospital.admin.service.*;



@WebServlet("/AddRecep")
public class AddRecep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 
		  String name=request.getParameter("name");
		  String email=request.getParameter("email");
		  String contact=request.getParameter("contact");
		
		  RecepModel rmodel=new RecepModel();
		  rmodel.setName(name);
		  rmodel.setEmail(email);
		  rmodel.setContact(contact);
		 
		  RecepService rs=new RecepServiceIMPL();
		  
		  boolean b=rs.isAddRecep(rmodel);
		  if(b)
		  {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			  r.include(request, response);
			  out.println("<h1>Receptionist Added.......</h1>");
		  }
		
		  else {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//				r.include(request, response);
			  out.println("<h1>Receptionist not addeed.....</h1>");
		  }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
