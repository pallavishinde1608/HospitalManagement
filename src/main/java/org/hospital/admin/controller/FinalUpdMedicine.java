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
 * Servlet implementation class FinalUpdMedicine
 */
@WebServlet("/FinalUpdmedicine")
public class FinalUpdMedicine extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String medicine=request.getParameter("medicine");
		PrescriptionModel pmodel=new PrescriptionModel();
		pmodel.setPid(pid);
		pmodel.setMedicine(medicine);
		PrescriptionService ps=new PrescriptionServiceIMPL();
		boolean result=ps.isUpdateMedicine(pmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewSerachDoctor.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Patient Not Updated.......</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
