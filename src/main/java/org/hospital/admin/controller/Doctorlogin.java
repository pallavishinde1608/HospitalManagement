package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hospital.admin.model.*;
import org.hospital.admin.service.*;


/**
 * Servlet implementation class Doctorlogin
 */
@WebServlet("/doctorlogin")
public class Doctorlogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String employee=request.getParameter("employee");
		String u=request.getParameter("username");
		String p=request.getParameter("password");
		int result;
		if(employee.equals("Doctor"))
		{
//		DoctorModel dmodel=new DoctorModel();
//		 dmodel.setEmail(u);
//		 dmodel.setContact(p);
		DoctorService ds=new DoctorServiceIMPL();
		 result=ds.getDoctor(u,p);
		
		
		// System.out.println("u="+u+"p="+p+"result"+result);
		 //System.out.println(result);
		  if(result!=0)
		  {
			  HttpSession session=request.getSession(true);
			  session.setAttribute("did",result);
			 RequestDispatcher r=request.getRequestDispatcher("ViewSerachDoctor.jsp");
				 r.forward(request, response);
		  }
		}
		else {
			RecepService rs=new RecepServiceIMPL();
			 result=rs.getRecep(u,p);
			 if(result!=0)
			  {
				  HttpSession session=request.getSession(true);
				  session.setAttribute("did",result);
				 RequestDispatcher r=request.getRequestDispatcher("ReceptionistDashBoard.jsp");
					 r.forward(request, response);
			  }
		
		  else {
//			  RequestDispatcher r=request.getRequestDispatcher("DoctorLoginPage.jsp");
//				 r.include(request, response);
			  out.println("invalid email and password");
		  }
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
