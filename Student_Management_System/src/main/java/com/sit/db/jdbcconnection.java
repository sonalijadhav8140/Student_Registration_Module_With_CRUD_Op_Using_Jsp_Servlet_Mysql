package com.sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcconnection {
            
	public static Connection JDBC_connection() {
	   Connection con=null;
		
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_crud","root","root");
		 
		 
		 
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	   
	   
		return con;
		
	
		
	}
}
