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
 * Servlet implementation class FinalUpdRecep
 */
@WebServlet("/FinalUpdRecep")
public class FinalUpdRecep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int rid=Integer.parseInt(request.getParameter("rid"));
		String  name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		RecepModel rmodel=new RecepModel();
		rmodel.setRid(rid);
		rmodel.setName(name);
		rmodel.setEmail(email);
		rmodel.setContact(contact);
		RecepService rs=new RecepServiceIMPL();
		boolean result=rs.isUpdateRecep(rmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewRecep.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Receptionist Not Updated.......</h1>");
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
