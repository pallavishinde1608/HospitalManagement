package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.*;
import org.hospital.admin.service.*;


@WebServlet("/login")
public class LoginPage extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String u=request.getParameter("username");
		String p=request.getParameter("password");
		
		adminModel amodel=new adminModel();
		 amodel.setUsername(u);
		 amodel.setPassword(p);
		Adminservice as=new AdminServiceIMPL();
		  
		 int result=as.getAdmin(amodel);
		  if(result==1)
		  {
			 RequestDispatcher r=request.getRequestDispatcher("AdminDashBoard.jsp");
				 r.include(request, response);
		  }
		  else {
			  RequestDispatcher r=request.getRequestDispatcher("LoginPage.jsp");
				 r.include(request, response);
		  }
		
		
		}
		   
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
