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


/**
 * Servlet implementation class NextAllocateMedicine
 */
@WebServlet("/nextMedicine")
public class NextAllocateMedicine extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		int did=Integer.parseInt(request.getParameter("did"));
		String medicine=request.getParameter("medicine");
		
		PrescriptionModel pmodel=new PrescriptionModel();
		pmodel.setPid(pid);
		pmodel.setDid(did);
		pmodel.setMedicine(medicine);
		
		
		
		PrescriptionService ps=new PrescriptionServiceIMPL();
		boolean result=ps.isAddPrescription(pmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewSerachDoctor.jsp");
			r.forward(request, response);
//			out.println("<h1>Prescription Added.......</h1>");
		}
		else {
			out.println("<h1>Prescription  Not Added.......</h1>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
