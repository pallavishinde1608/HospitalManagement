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
 * Servlet implementation class DeleteRecep
 */
@WebServlet("/DelRecep")
public class DeleteRecep extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int rid=Integer.parseInt(request.getParameter("rid"));
		RecepService rs=new RecepServiceIMPL();
		boolean b=rs.isDeleteRecep(rid);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewRecep.jsp");
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
