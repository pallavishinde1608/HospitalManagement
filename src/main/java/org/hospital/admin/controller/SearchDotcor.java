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

import org.hospital.admin.model.DoctorModel;
import org.hospital.admin.service.DoctorService;
import org.hospital.admin.service.DoctorServiceIMPL;


@WebServlet("/doctSearch")
public class SearchDotcor extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("n");
		DoctorService ds=new DoctorServiceIMPL();
		List<DoctorModel> list=ds.isSearchDoctorByName(name);
		request.setAttribute("list", list);
		RequestDispatcher r=request.getRequestDispatcher("ViewSerachDoctor.jsp");
		r.include(request, response);
		/*
		 * b.forEach(l->System.out.println(l)); if(b != null) { RequestDispatcher
		 * r=request.getRequestDispatcher("ViewSearchDoctor.jsp"); r.forward(request,
		 * response); } else { out.println("<h1>Some probleme is there......</h1>"); }
		 */
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
