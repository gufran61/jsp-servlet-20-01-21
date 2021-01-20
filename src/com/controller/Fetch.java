package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegisterBean;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class Fetch
 */
@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterBean rb = new RegisterBean();
  @Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
Dao dao = new DaoImpl();
List<RegisterBean>list1=dao.fetch();
for(RegisterBean rb : list1) {
	System.out.println(rb);
}
req.setAttribute("set", list1);
RequestDispatcher rd =req.getRequestDispatcher("welcome.jsp");
rd.include(req, res);
  }

}
