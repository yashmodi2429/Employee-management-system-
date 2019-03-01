package com.employee.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.employee.dao.implementation.*;
import com.employee.model.Pojo;

@WebServlet("/ShowEmployee")
public class ShowEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			
			Pojo p = new Pojo();
			p.setEmployeeId(id);
			DaoImplementation dao = new DaoImplementation();
			ArrayList<Pojo> count = (ArrayList<Pojo>) dao.showEmployee(p);
			System.out.println("count "+ count);
			System.out.println("count ShowEmployee "+p.getEmployeeSalary());
			if(count.isEmpty())
			{ 
				response.sendRedirect("error.jsp");
			}else {
				
				 request.setAttribute("employeedata", count);
				 request.getRequestDispatcher("showemployeedetails.jsp").forward(request, response);	
			}
		}
		catch(Exception e)
		{
			response.sendRedirect("error.jsp");
		}
		
	}


}
