package com.sit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sit.DaoI.StudentDaoI;
import com.sit.daoIMPL.StudentDaoIMPL;
import com.sit.model.Student;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		  StudentDaoI sdi =new StudentDaoIMPL();
		  
		String email = req.getParameter("email");
		String password=req.getParameter("password");
		String address=req.getParameter("addr");
		String name=req.getParameter("name");
		
	    
		  Student c=new Student();
		   
		   c.setName(name);
          c.setEmail(email);
          c.setAddr(address);
          c.setPassword(password);
          
          List<Student> list = sdi.saveInfo(c);
          
         res.sendRedirect("login.jsp");
		     
	}

	

}
