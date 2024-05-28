package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.*;
import org.hospital.admin.service.*;
import org.hospital.admin.service.DoctorServiceIMPL;


@WebServlet("/FinalUpdP")
public class FinalUpdPatient extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("name");
		
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		int age=Integer.parseInt(request.getParameter("age"));
	    String gender=request.getParameter("gender");
	    String category=request.getParameter("category");
	    String email=request.getParameter("email");
	    String date=request.getParameter("date");
	    String type=request.getParameter("type");
	    String status=request.getParameter("status");
		PatientModel pmodel=new PatientModel();
		pmodel.setPid(pid);
		pmodel.setName(name);
		
		pmodel.setContact(contact);
		pmodel.setAddress(address);
		pmodel.setAge(age);
		pmodel.setGender(gender);
		pmodel.setCategory(category);
		pmodel.setEmail(email);
		pmodel.setDate(date);
		pmodel.setType(type);
		pmodel.setStatus(status);
		
		PatientService ps=new PatientServiceIMPL();
		boolean result=ps.isUpdatePatient(pmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewPatient.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Patient Not Updated.......</h1>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
