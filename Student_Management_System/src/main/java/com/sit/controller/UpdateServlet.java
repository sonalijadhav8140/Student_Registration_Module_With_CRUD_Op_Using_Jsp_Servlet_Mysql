package com.sit.controller;

import java.io.IOException;
import java.security.Provider.Service;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sit.DaoI.StudentDaoI;
import com.sit.daoIMPL.StudentDaoIMPL;
import com.sit.model.Student;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int rollno = Integer.parseInt(req.getParameter("rollno"));
		String name = req.getParameter("name");
		String email =req.getParameter("email");
		String addr = req.getParameter("addr");
		String password =req.getParameter("password");
		
		StudentDaoI sdi=new StudentDaoIMPL();
		Student s=new Student();
		s.setRollno(rollno);
		s.setName(name);
		s.setEmail(email);
		s.setAddr(addr);
		s.setPassword(password);
		
		
		List<Student> list = sdi.UpdateData(s);
		if (list != null && !list.isEmpty()) {

			req.setAttribute("AllData", list);

			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		}

	}
	
}
