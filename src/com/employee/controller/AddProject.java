package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.employee.dao.implementation.*;
import com.employee.model.Pojo;

/**
 * Servlet implementation class AddProject
 */
@WebServlet("/AddProject")
public class AddProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			String name = request.getParameter("name");
			int assign_to = Integer.parseInt(request.getParameter("assign_to"));
			
			Pojo p = new Pojo();
			p.setProjectName(name);
			p.setAssignTo(assign_to);
			DaoImplementation dao = new DaoImplementation();
			int count = dao.addProject(p);
			if(count!=0)
			{
				response.sendRedirect("sucess.jsp");
			}
			else
			{
				response.sendRedirect("error.jsp");
			}

		}
		catch(Exception e)
		{
			response.sendRedirect("error.jsp");
		}
	}

}
