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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int rollno = Integer.parseInt(req.getParameter("id"));
		
		StudentDaoI sdi=new StudentDaoIMPL();
		
		List<Student> list = sdi.DeleteData(rollno);
		if (list != null && !list.isEmpty()) {

			req.setAttribute("AllData", list);

			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		}

	}

}
