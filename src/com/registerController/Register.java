package com.registerController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.bean.RegisterBean;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//super.service(req, res);
		RegisterBean rb = new RegisterBean();
		LoginBean lb = new LoginBean();
		rb.setUsername(req.getParameter("username"));
		rb.setPassword(req.getParameter("password"));
		rb.setPhoneNumber(req.getParameter("phoneNumber"));
		Dao dao = new DaoImpl();
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		boolean b=dao.validationRegister(rb);
		System.out.println(b+" "+"in register");
		if(b==true) {
			
			pw.print("<p>already register pls login</p>");
			req.getRequestDispatcher("login.jsp").include(req, res);  
		}else {
			dao.insert(rb);
			pw.print("<h1>registration done pls login</h1>");
			req.getRequestDispatcher("login.jsp").include(req, res); 
		}
	}

}
