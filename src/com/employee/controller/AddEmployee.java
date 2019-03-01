package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.employee.model.Pojo;
import com.employee.dao.implementation.*;
/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try {
			System.out.println("Add Employee");
		String name = request.getParameter("name");
		Float salary = Float.parseFloat(request.getParameter("salary"));
		Pojo p = new Pojo();
		p.setEmployeeName(name);
		p.setEmployeeSalary(salary);

		DaoImplementation d = new DaoImplementation();
		System.out.println("calling DaoImplementation ");
		int count = d.addEmployee(p);
		if(count == 0)
		{
			response.sendRedirect("error.jsp");
		}
		else
		{
			response.sendRedirect("sucess.jsp");
		}
		}
		catch(Exception e)
		{
			response.sendRedirect("error.jsp");
		}
		
	}

}
