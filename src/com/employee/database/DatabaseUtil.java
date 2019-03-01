package com.employee.database;

import java.sql.*;

public class DatabaseUtil {

	public static Connection createConnection()
	{
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","yash");
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		return con;
	}
}
