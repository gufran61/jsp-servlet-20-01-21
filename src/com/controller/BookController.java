package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BookDetail;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class BookController
 */
//@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		BookDetail bd = new BookDetail();
		bd.setAmount(req.getParameter("amount"));
		bd.setBalance(req.getParameter("balance"));
		bd.setbGName(req.getParameter("bGName"));
		bd.setbGpNumber(req.getParameter("bGpNumber"));
		bd.setbTaker(req.getParameter("bTaker"));
		bd.setbTPnumber(req.getParameter("bTPnumber"));
		bd.setCash(req.getParameter("cash"));
		bd.setDate(req.getParameter("date"));
		bd.setNote(req.getParameter("note"));
		Dao dao = new DaoImpl();
		dao.insertBd(bd);
	}

}
