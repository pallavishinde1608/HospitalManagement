package org.hospital.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hospital.admin.model.PrescriptionModel;
import org.hospital.admin.service.PrescriptionService;
import org.hospital.admin.service.PrescriptionServiceIMPL;

/**
 * Servlet implementation class NextAddMedicine
 */
@WebServlet("/nextAddMedicine")
public class NextAddMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NextAddMedicine() {
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
		String medicine=request.getParameter("medicine");
		
		PrescriptionModel pmodel=new PrescriptionModel();
		pmodel.setPid(pid);
		pmodel.setDid(did);
		pmodel.setMedicine(medicine);
		
		
		
		PrescriptionService ps=new PrescriptionServiceIMPL();
		boolean result=ps.isAddPrescription(pmodel);
		if(result)
		{
			RequestDispatcher r=request.getRequestDispatcher("ViewPatient.jsp");
			r.forward(request, response);
//			out.println("<h1>Prescription Added.......</h1>");
		}
		else {
			out.println("<h1>Prescription  Not Added.......</h1>");
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
