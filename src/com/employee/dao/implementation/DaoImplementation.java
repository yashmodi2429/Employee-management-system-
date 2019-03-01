package com.employee.dao.implementation;

import java.sql.*;
import com.employee.model.*;
import com.employee.dao.interf.*;
import com.employee.database.DatabaseUtil;
import java.util.*;
public class DaoImplementation implements DaoInterf{
	
	
	 Pojo p = new Pojo();
	private static PreparedStatement pst=null;
	public static Connection con=DatabaseUtil.createConnection();
	public static int rs;
	public int addEmployee(Pojo p ) {
		System.out.println("Inside Dao Implementation con value "+ con);
		int employeeAdded =0;
		String query="insert into employeetbl (name) values(?)";
		String last_id = "SET @last_id = LAST_INSERT_ID()";
		String query2="insert into salary (id , salary) values(@last_id, ?)";
		try {
						
			pst=con.prepareStatement(query);
			pst.setString(1, p.getEmployeeName());
			employeeAdded =pst.executeUpdate();
			pst=con.prepareStatement(last_id);
			employeeAdded =pst.executeUpdate();
			pst=con.prepareStatement(query2);
			pst.setFloat(1, p.getEmployeeSalary());
			employeeAdded =pst.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return employeeAdded;
		
	}
	
	public List<Pojo> showEmployee(Pojo p){  
	    List<Pojo> list=new ArrayList<Pojo>();  
	      
	    try{  
	         String q1 = "select employeetbl.id , employeetbl.name , salary.salary from employeetbl INNER JOIN salary ON employeetbl.id = salary.id WHERE employeetbl.id=" +p.getEmployeeId();

	    	pst= con.prepareStatement(q1);  
	        ResultSet rs=pst.executeQuery(); 
	        
	        while(rs.next()){  
	        	p.setEmployeeId(rs.getInt("id"));  
	            p.setEmployeeName(rs.getString("name"));  
	            p.setEmployeeSalary(rs.getFloat("salary"));
	            
	            list.add(p);  
	        }
	      
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    	}  
	    return list;  
	}  
	public boolean deleteEmployee(Pojo p)
	{
		boolean employeedeleted = false;
		 try{  
//	         String q1 = "delete employeetbl, salary from employeetbl INNER JOIN salary ON employeetbl.id = salary.id WHERE employeetbl.id="+p.getEmployeeId(); 
	       pst= con.prepareStatement("delete from salary WHERE id="+p.getEmployeeId());  
	       employeedeleted = pst.execute();
	       pst= con.prepareStatement("delete from project WHERE id="+p.getEmployeeId());  
	       employeedeleted = pst.execute(); 
	       pst= con.prepareStatement("delete from employeetbl WHERE id="+p.getEmployeeId());  
	       employeedeleted = pst.execute(); 
	    }catch(Exception e){System.out.println(e);}  
	    return employeedeleted;  
	}
	public int updateEmployee(Pojo p)
	{
		int updateemployee=0;
		try {
			pst=con.prepareStatement("update employeetbl set name=?"+" where id=?");			
			pst.setString(1, p.getEmployeeName());
			pst.setInt(2, p.getEmployeeId());
			updateemployee =pst.executeUpdate();
			pst=con.prepareStatement("update salary set salary=?"+" where id=?");
			pst.setFloat(1, p.getEmployeeSalary());
			pst.setInt(2, p.getEmployeeId());
			updateemployee =pst.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return updateemployee;
	}
	public int addProject(Pojo p)
	{
		int addproject=0;
		try {
			pst=con.prepareStatement("INSERT INTO project (description,emp_id) VALUES (?,?)");
			
			pst.setString(1, p.getProjectName());
			pst.setInt(2, p.getAssignTo());
			addproject =pst.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return addproject;
	}
	
	public List<Pojo> showEmployeeProject(Pojo p){  
	    List<Pojo> list=new ArrayList<Pojo>();  
	      
	    try{  
	         String q1 = "select employeetbl.name , project.description , project.id from project INNER JOIN employeetbl ON employeetbl.id = project.emp_id WHERE employeetbl.id=" +p.getEmployeeId();

	    	pst= con.prepareStatement(q1);  
	        ResultSet rs=pst.executeQuery(); 
	       
	        while(rs.next()){  
	        	p.setEmployeeName(rs.getString("name"));
	        	p.setProjectId(rs.getInt("id"));  
	            p.setProjectName((rs.getString("description")));           
	            list.add(p);  
	        }
	        
	       
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    	}  
	    return list;  
	}  

}
