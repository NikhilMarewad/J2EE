package com.cognizant.servlet.modal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EmployeeDetialsServlet4
 */
@WebServlet("/EmployeeDetialsServlet4")
public class EmployeeDetialsServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetialsServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Employee4 employee4=new Employee4();
		employee4.setEmployeeId(969143);
		employee4.setEmployeeName("John");
		employee4.setGender("Male");
		employee4.setEmployeedob("08/07/1987");
		employee4.setFullEmployee(true);
		request.setAttribute("employee4", employee4);
		RequestDispatcher rd=request.getRequestDispatcher("edit-employee3.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
