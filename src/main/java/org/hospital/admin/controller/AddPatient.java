package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.*;
import org.hospital.admin.service.*;


@WebServlet("/patientInfo")
public class AddPatient extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  String name=request.getParameter("name");
		  String address=request.getParameter("address");
		  String contact=request.getParameter("contact");
		 
		  int age=Integer.parseInt(request.getParameter("age"));
		  String gender=request.getParameter("gender");
		 
		  String category=request.getParameter("category");
		  String email=request.getParameter("email");
		  String date=request.getParameter("date");
		  String type=request.getParameter("type");
		  String status=request.getParameter("status");
		 
		  PatientModel pmodel=new PatientModel();
		  pmodel.setName(name);
		  pmodel.setAddress(address);
		  pmodel.setContact(contact);
		  
		  pmodel.setAge(age);
		  pmodel.setGender(gender);
		  pmodel.setCategory(category);
		  pmodel.setEmail(email);
		  pmodel.setDate(date);
		  pmodel.setType(type);
		  pmodel.setStatus(status);
		  
		  
		 
		  PatientService ps=new PatientServiceIMPL();
		  
		  boolean b=ps.isAddPatient(pmodel);
		  if(b)
		  {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			  r.include(request, response);
			  out.println("<h1>Patient Added.......</h1>");
		  }
		
		  else {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//				r.include(request, response);
			  out.println("<h1>Patient not addeed.....</h1>");
		  }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
