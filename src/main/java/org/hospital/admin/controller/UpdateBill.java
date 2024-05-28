package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateBill
 */
@WebServlet("/BillUpd")
public class UpdateBill extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		int bid=Integer.parseInt(request.getParameter("billid"));
		String billdate=request.getParameter("Billdate");
		String billtime=request.getParameter("Billtime");
		int doctorfee=Integer.parseInt(request.getParameter("Doctorfee"));
		int roomcost=Integer.parseInt(request.getParameter("Roomcost"));
		int total=Integer.parseInt(request.getParameter("total"));
		
		RequestDispatcher r=request.getRequestDispatcher("ReceptionistDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Update-doctor.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formfuel' name='frm' action='FinalupdBill' method='Post'>");
		out.println("<h1>Update Patient</h1>");
		out.println("<input type='hidden' value='"+bid+"' class='form-control c' name='billid'><br>");
		out.println(" <lable for=\"doctorcode\">Bill Date</lable><br>");
		out.println("<input type='text' value='"+billdate+"' class='form-control c' name='billdate' placeholder='Enter doctor name'><br>");
		out.println(" <lable for=\"doctorcode\">Bill Time</lable><br>");
		out.println("<input type='text' value='"+billtime+"' class='form-control c' name='billtime' placeholder='Enter patient contact'><br>");
		out.println(" <lable for=\"doctorcode\">Doctor Fee</lable><br>");
		out.println("<input type='text' value='"+doctorfee+"' class='form-control c' name='doctorfee'  placeholder='Enter patient address'><br>");
		out.println(" <lable for=\"doctorcode\">Room Cost</lable><br>");
		out.println("<input type='text' value='"+roomcost+"' class='form-control c' name='roomcost'  placeholder='Enter patient address'><br>");
		out.println(" <lable for=\"doctorcode\">Total</lable><br>");
		out.println("<input type='text' value='"+total+"' class='form-control c' name='total'  placeholder='Enter patient address'><br>");
		
		out.println("<button type='submit' name='s' class='btn bg-primary'>Update Bill</button>");
		out.println("</div></div></div>");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
