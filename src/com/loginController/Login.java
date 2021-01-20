package com.loginController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		LoginBean lb = new LoginBean();

		lb.setUsername(req.getParameter("username"));
		lb.setPassword(req.getParameter("password"));

		Dao dao = new DaoImpl();

		boolean b = dao.validation(lb);
		System.out.println(b + " " + "in login");
		if (b == true) {
			/*
			 * Cookie ck=new Cookie("name",lb.getUsername()); res.addCookie(ck);
			 */

			res.sendRedirect("welcome.jsp");

		} else {
			res.sendRedirect("register.jsp");
		}
		// super.service(req, res);
	}
}
