package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Logout() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		req.getRequestDispatcher("login.jsp").include(req, res);

		HttpSession session = req.getSession();
		System.out.println(session.getId());
		session.invalidate();

		/*
		 * Cookie ck=new Cookie("name",""); ck.setMaxAge(0); res.addCookie(ck);
		 */

		out.print("You are successfully logged out!");

		out.close();
	}
}
