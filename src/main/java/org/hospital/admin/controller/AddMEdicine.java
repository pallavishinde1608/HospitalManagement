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
 * Servlet implementation class AddMEdicine
 */
@WebServlet("/AddMedicine")
public class AddMEdicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMEdicine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		int did=Integer.parseInt(request.getParameter("did"));
	    
		RequestDispatcher r=request.getRequestDispatcher("ReceptionistDashBoard.jsp");
		r.include(request,response);
		out.println("<link href='CSS/Upd-Patient.css' rel='stylesheet'>");
		out.println("<div class='col-md-8'>");
		out.println(" <form class='formarea' name='frm' action='nextAddMedicine' method='Post'>");
		out.println("<h1>Prescription</h1>");
		out.println("<input type='hidden' value='"+pid+"' class='form-control1 control1' name='pid'>");
		out.println("<input type='hidden' value='"+did+"' class='form-control1 control1' name='did'>");
		out.println(" <lable for='patient' style='margin-left:15px;'>Medicine Name :</lable>");
		out.println("<input type='text' value='' class='form-control1 control1' name='medicine' style='padding:8px;' placeholder='enter medicine name'>");
		out.println("<br><br><button type='submit' name='s' class='btn bg-secondary' style='color:white; margin:10px;background-color:gray; border:none; padding:8px;'>Add Medicine</button>");
		out.println("</div></div></div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
