package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.service.*;

/**
 * Servlet implementation class AddDoctor
 */
@WebServlet("/addDoctor")
public class AddDoctor extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		 
		  String name=request.getParameter("name");
		  String contact=request.getParameter("specialization");
		  String specialization=request.getParameter("contact");
		  String email=request.getParameter("Email");
		  String schedule=request.getParameter("schedule");
		  String category=request.getParameter("category");
		  
		  DoctorModel dmodel=new DoctorModel();
		  dmodel.setName(name);
		  dmodel.setContact(contact);
		  dmodel.setSpecialization(specialization);
		  dmodel.setEmail(email);
		  dmodel.setSchedule(schedule);
		  dmodel.setCategory(category);
		  
		 
		  DoctorService ds=new DoctorServiceIMPL();
		  
		  boolean b=ds.isAddDoctor(dmodel);
		  if(b)
		  {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			  r.include(request, response);
			  out.println("<h2>Doctor Added.......</h2>");
		  }
		
		  else {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			  r.include(request, response);
			  out.println("<h2>doctor not addeed.....</h2>");
		  }
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
