package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.service.*;


/**
 * Servlet implementation class DeletePrescription
 */
@WebServlet("/DelPrescription")
public class DeletePrescription extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		PrescriptionService ps=new PrescriptionServiceIMPL();
		boolean b=ps.isDeletePrescriptionById(pid);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewPatient.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Some probleme is there......</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
