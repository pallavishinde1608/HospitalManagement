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
import org.hospital.admin.service.DoctorService;
import org.hospital.admin.service.DoctorServiceIMPL;

/**
 * Servlet implementation class FinalAdminDoctoripdate
 */
@WebServlet("/FinalUpdAdmin")
public class FinalAdminDoctoripdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int did=Integer.parseInt(request.getParameter("did"));
		String name=request.getParameter("name");
		String specialization=request.getParameter("specialization");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String schedule=request.getParameter("schedule");
		String category=request.getParameter("category");
		DoctorModel dmodel=new DoctorModel();
		dmodel.setDid(did);
		dmodel.setName(name);
		dmodel.setSpecialization(specialization);
		dmodel.setContact(contact);
		dmodel.setEmail(email);
		dmodel.setSchedule(schedule);
		dmodel.setCategory(category);
		
		DoctorService ds=new DoctorServiceIMPL();
		boolean result=ds.isUpdateDoctorById(dmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewDoctor.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Doctor Not Updated.......</h1>");
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
