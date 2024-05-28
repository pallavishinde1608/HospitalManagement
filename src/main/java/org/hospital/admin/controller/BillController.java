package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hospital.admin.model.*;
import org.hospital.admin.service.*;

/**
 * Servlet implementation class BillController
 */
@WebServlet("/Bill")
public class BillController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		int doctorFee=Integer.parseInt(request.getParameter("fee"));
		int roomcost=Integer.parseInt(request.getParameter("cost"));
		int total=Integer.parseInt(request.getParameter("total"));
		Billmodel bmodel=new Billmodel();
		bmodel.setPid(pid);
		bmodel.setDate(date);
		bmodel.setTime(time);
		bmodel.setDoctorfee(doctorFee);
		bmodel.setRoomcost(roomcost);
		bmodel.setTotal(total);
		
		
		BillService bs=new BillServiceIMPL();
		int b=bs.isAddBill(bmodel);
 
		  
		
		  if(b==1)
		  {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//			  r.include(request, response);
			  out.println("<h1>Bill Successfully.......</h1>");
		  }
		
		  else {
//			  RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
//				r.include(request, response);
			  out.println("<h1>Bill not  Success....</h1>");
		  }
		}
		
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
