package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.*;
import org.hospital.admin.service.*;



@WebServlet("/searchPatient")
public class searchPatient extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		PatientService ps=new PatientServiceIMPL();
		List<PatientModel> list=ps.isSearchPatientByName(name);
		request.setAttribute("b", list);
		
		RequestDispatcher r=request.getRequestDispatcher("ViewSerchPatient.jsp");
		r.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
