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
import org.hospital.admin.service.DoctorServiceIMPL;

/**
 * Servlet implementation class BeleteBill
 */
@WebServlet("/DelBill")
public class BeleteBill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int billid=Integer.parseInt(request.getParameter("billid"));
		BillService bs=new BillServiceIMPL();
		boolean b=bs.isDeleteBillById(billid);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewBill.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Some probleme is there......</h1>");
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
