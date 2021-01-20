package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.PaymentBean;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class Payment
 */
@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PaymentBean pb = new PaymentBean();
		pb.setAmount(req.getParameter("amount"));
		pb.setDate(req.getParameter("date"));
		pb.setgName(req.getParameter("gName"));
		pb.setGPnumber(req.getParameter("GPnumber"));
		pb.setNote(req.getParameter("note"));
		pb.setrName(req.getParameter("rName"));
		pb.setrPnumber(req.getParameter("rPnumber"));
		Dao dao = new DaoImpl();
		dao.insertPayment(pb);
	}

}
