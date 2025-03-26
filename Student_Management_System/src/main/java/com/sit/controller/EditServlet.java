package com.sit.controller;

import java.io.IOException;
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

@WebServlet("/edit")
public class EditServlet extends HttpServlet{
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int rollno =Integer.parseInt(req.getParameter("id"));
		System.out.println(rollno);
		StudentDaoI sdi=new StudentDaoIMPL();
		
		Student editData= sdi.EditData(rollno);
		
		req.setAttribute("s", editData);
		RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
		rd.forward(req, resp);
	}
	
}
