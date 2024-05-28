package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.Billmodel;
import org.hospital.admin.service.*;

/**
 * Servlet implementation class FinalUpdateBill
 */
@WebServlet("/FinalupdBill")
public class FinalUpdateBill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String billdate=request.getParameter("billdate");
		String billtime=request.getParameter("billtime");
		int doctorfee=Integer.parseInt(request.getParameter("doctorfee"));
		int roomcost=Integer.parseInt(request.getParameter("roomcost"));
		int total=Integer.parseInt(request.getParameter("total"));
		Billmodel bmodel=new Billmodel();
		bmodel.setPid(pid);
		bmodel.setDate(billdate);
		bmodel.setTime(billtime);
		bmodel.setDoctorfee(doctorfee);
		bmodel.setRoomcost(roomcost);
		bmodel.setTotal(total);
		
		BillService bs=new BillServiceIMPL();
		boolean result=bs.isUpdateBill(bmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewBill.jsp");
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
