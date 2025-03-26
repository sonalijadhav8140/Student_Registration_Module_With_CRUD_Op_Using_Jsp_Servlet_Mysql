package com.sit.daoIMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sit.DaoI.StudentDaoI;
import com.sit.db.jdbcconnection;
import com.sit.model.Student;


public class StudentDaoIMPL implements StudentDaoI {

	
	private Connection con=jdbcconnection.JDBC_connection();

	@Override
	public List<Student> saveInfo(Student s) {
	   
		String sql="insert into Student(name,email,addr,password) values(?,?,?,?)";
		try {
			PreparedStatement smt = con.prepareStatement(sql);
			                  smt.setString(1, s.getName());
			                  smt.setString(2, s.getEmail());
			                  smt.setString(3, s.getAddr());
			                  smt.setString(4, s.getPassword());
			                  
			                  smt.execute();
			                  
			                  
			                  
			                  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

	@Override
	public List<Student> logincheck(String email, String password) {
		
		List<Student> list=null;
		String sql="select * from student where email='"+email+"' and password='"+password+"'";
		try {
			
			Statement smt = con.createStatement();
			         ResultSet rs = smt.executeQuery(sql);
			       list=  new ArrayList<Student>();
			         if(rs.next()) {
			        	 Student s=new Student();
			        	 s.setRollno(rs.getInt("rollno"));
			        	 s.setName(rs.getNString("name"));
			        	 s.setEmail(rs.getString("email"));
			        	 s.setAddr(rs.getString("addr"));
			        	 s.setPassword(rs.getString("password"));
			        	 
			        	 list.add(s);
			         }
			         
			         else {
			        	 
			        	 return null;
			         }
			         
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Student> getAllData() {
	
		List<Student> list=null;
		
		String sql="select * from Student";
		   try {
			Statement smt = con.createStatement();
			    ResultSet rs = smt.executeQuery(sql);
			    
			     list=new ArrayList<Student>();
			    while(rs.next()) {
			    	
			    	Student s=new Student();
			    	s.setRollno(rs.getInt("rollno"));
			    	s.setName(rs.getString("name"));
			    	s.setEmail(rs.getString("email"));
			    	s.setAddr(rs.getString("addr"));
			    	s.setPassword(rs.getString("password"));
			    	list.add(s);
			    }
			    
			    System.out.println("IMPL Data"+list);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Student EditData(int rollno) {
		 Student s=null;
		String sql="select * from Student where rollno='"+rollno+"'";
		
		try {
			Statement smt = con.createStatement();
			     ResultSet rs = smt.executeQuery(sql);
			     
			     if(rs.next()) {
			    	 
			    	 s=new Student();
			    	 s.setRollno(rs.getInt("rollno"));
			    	 s.setName(rs.getString("name"));
			    	 s.setEmail(rs.getString("email"));
			    	 s.setAddr(rs.getString("addr"));
			    	 s.setPassword(rs.getString("password"));
			    	
			    	 
			     }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return s;
		
	}

	@Override
	public List<Student> UpdateData(Student s) {
		
		List<Student> list=null;
		
		String sql="update student set name=?,email=?,addr=?,password=? where rollno=?";
		     try {
				PreparedStatement psmt = con.prepareStatement(sql);
				   psmt.setString(1,s.getName());
				   psmt.setString(2,s.getEmail());
				   psmt.setString(3,s.getAddr());
				   psmt.setString(4,s.getPassword());
				   psmt.setInt(5,s.getRollno());
				   
				   psmt.execute();
				   
				   list=getAllData();
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		
		return list;
	}

	@Override
	public List<Student> DeleteData(int rollno) {
		List<Student> list=null;
		
		String sql="delete from student where rollno='"+rollno+"'";
		try {
			Statement smt = con.createStatement();
			smt.execute(sql);
			
			list=getAllData();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}
	
}


