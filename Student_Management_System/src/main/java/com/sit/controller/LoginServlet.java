package com.sit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sit.DaoI.StudentDaoI;
import com.sit.daoIMPL.StudentDaoIMPL;
import com.sit.model.Student;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		StudentDaoI sdi = new StudentDaoIMPL();

		PrintWriter out = res.getWriter();

		if (email.equals("admin@gmail.com") && password.equals("admin")) {
			List<Student> alldata = sdi.getAllData();
			req.setAttribute("AllData", alldata);

			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		}

		else {
			List<Student> list = sdi.logincheck(email, password);

			if (list != null && !list.isEmpty()) {

				req.setAttribute("AllData", list);

				RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
				rd.forward(req, res);
			}

			else {

				req.setAttribute("errorMessage", "Invalid email or password. Please try again.");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);

			}
		}
	}

}