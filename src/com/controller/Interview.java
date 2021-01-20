package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.InterviewBean;
import com.dao.Dao;
import com.daoImpl.DaoImpl;

/**
 * Servlet implementation class Interview
 */
//@WebServlet("/Interview")
public class Interview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Interview() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		InterviewBean ib = new InterviewBean();
		ib.setcName(req.getParameter("cName"));
		ib.setHrCName(req.getParameter("hrCName"));
		ib.setHrName(req.getParameter("hrName"));
		ib.setHrPnumber(req.getParameter("hrPnumber"));
		ib.setIgb(req.getParameter("igb"));
		ib.setiResult(req.getParameter("iResult"));
		ib.setNote(req.getParameter("note"));
		Dao dao= new DaoImpl();
		dao.insertInterview(ib);
	}

}
