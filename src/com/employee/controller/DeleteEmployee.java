package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.employee.model.*;
import com.employee.dao.implementation.*;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		try {
    			int id = Integer.parseInt(request.getParameter("delete_id"));
        		System.out.println("id is "+ id);
        		Pojo p = new Pojo();
        		 p.setEmployeeId(id);
        		DaoImplementation dao = new DaoImplementation();
        		boolean count = dao.deleteEmployee(p);
        		System.out.println("count "+ count);
        		if(count!=true)
        		{
        		response.sendRedirect("sucess.jsp");
        		}
        		else
        		{
        			response.sendRedirect("deleteemployee.jsp");
        		}
    		}
    		catch(Exception e)
    		{
    			System.out.println(e.toString());
    			response.sendRedirect("error.jsp");
    		}
	}

}
