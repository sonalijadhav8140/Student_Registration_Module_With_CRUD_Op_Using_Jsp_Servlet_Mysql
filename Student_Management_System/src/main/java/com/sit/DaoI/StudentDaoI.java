package com.sit.DaoI;

import java.util.List;

import com.mysql.cj.protocol.Resultset;

import com.sit.model.Student;

public interface StudentDaoI {
    
	public List<Student> saveInfo(Student s);
	
	public List<Student> logincheck(String email,String password);
	
	public List<Student> getAllData();
	
	public Student EditData(int rollno);
	
	public List<Student> UpdateData(Student s);
	
	public List<Student> DeleteData(int rollno);
	
	
}
