package com.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.BookDetail;
import com.bean.InterviewBean;
import com.bean.LoginBean;
import com.bean.PaymentBean;
import com.bean.RegisterBean;
import com.creatingConnection.CreateConnection;
import com.dao.Dao;
import com.sun.org.apache.bcel.internal.generic.INVOKEVIRTUAL;


public class DaoImpl implements Dao {
	Connection con ;
	PreparedStatement ps;
	ResultSet rs;
	List<RegisterBean>list=new ArrayList<RegisterBean>();
	

	/*
	 * //private static final String dbDriver = "com.mysql.jdbc.Driver"; private
	 * static final String dbURL = "jdbc:mysql:// localhost:3306/"; // Database name
	 * to access private static final String dbName = "servletProject"; private
	 * static final String dbUsername = "root"; private static final String
	 * dbPassword = "root"; //private static final Connection con = null;
	 */
	@Override
	public void insert(RegisterBean rb) {
		try {
			con = CreateConnection.openConnection();
			System.out.println(con);
			
			 ps = con.prepareStatement("insert into register(username,password,phonenumber) values (?,?,?)");
			ps.setString(1, rb.getUsername());
			ps.setString(2, rb.getPassword());
			ps.setString(3, rb.getPhoneNumber());
			ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	// validation done in 15-01-21- by farid
	public boolean validation(LoginBean lb) {
		try {
			con = CreateConnection.openConnection();
			System.out.println("done connection");
			 ps = con.prepareStatement("select * from register where username=?");// for dynamicaly // value taking
			ps.setString(1, lb.getUsername());// 1st line is must sop is also not taken
			 rs = ps.executeQuery();
			while (rs.next()) {
				if (lb.getUsername().equalsIgnoreCase(rs.getString(2)) && rs.getString(3).equals(lb.getPassword())) {
					System.out.println("in if block");
					return true;
				}
				else if (rs.getString(2).equals(lb.getUsername()) && rs.getString(3).equals(lb.getPassword())) {
					System.out.println("while");
					
					return true;
					// using equal method is good as compare to ==
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void insertBd(BookDetail bd) {
	try {
	con=CreateConnection.openConnection();
	ps=con.prepareStatement("insert into BookDetail (date,btName,btPnumber,bookGiver,bgPnumber,amount,cash,balance,note) values(?,?,?,?,?,?,?,?,?)");
	ps.setString(1, bd.getDate());
	ps.setString(2,bd.getbTaker());
	ps.setString(3, bd.getbTPnumber());
	ps.setString(4, bd.getbGName());
	ps.setString(5, bd.getbGpNumber());
	ps.setString(6, bd.getAmount());
	ps.setString(7, bd.getCash());
	ps.setString(8, bd.getBalance());
	ps.setString(9, bd.getNote());
	ps.executeUpdate();
	con.close();
	}
	catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
	}

	@Override
	public void insertInterview(InterviewBean ib) {
		try {
			con=CreateConnection.openConnection();
			ps=con.prepareStatement("insert into Interview (igb,hrName,hrCName,hrPnumber,cName,iResult,note) values (?,?,?,?,?,?,?)");
		ps.setString(1, ib.getcName());
		ps.setString(2, ib.getHrCName());
		ps.setString(3, ib.getHrName());
		ps.setString(4, ib.getHrPnumber());
		ps.setString(5, ib.getIgb());
		ps.setString(6, ib.getiResult());
		ps.setString(7, ib.getNote());
		ps.executeUpdate();
		con.close();
		
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
	}

	@Override
	public void insertPayment(PaymentBean pb) {
		try {
			con=CreateConnection.openConnection();
			ps=con.prepareStatement("insert into Payment (date,amount,rName,rPnumber,gName,GPnumber,note) values (?,?,?,?,?,?,?)");
		ps.setString(1,pb.getDate());
		ps.setString(2,pb.getAmount());
		ps.setString(3, pb.getrName());
		ps.setString(4,pb.getrPnumber());
		ps.setString(5,pb.getgName());
		ps.setString(6,pb.getgName());
		ps.setString(7, pb.getNote());
		ps.executeUpdate();
		con.close();
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
	}

	@Override
	public boolean validationRegister(RegisterBean rb) {
		try {
			con = CreateConnection.openConnection();
			System.out.println("done connection");
			 ps = con.prepareStatement("select * from register where username=?");// for dynamicaly // value taking
			ps.setString(1, rb.getUsername());// 1st line is must sop is also not taken
			 rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(2).equalsIgnoreCase(rb.getUsername())&&rs.getString(3).equals(rb.getPassword())) {
					System.out.println("in if block");
					return true;
				}
				else {
					System.out.println("else");
					//insert(rb);
					return false;
} 
			
			}} catch (Exception e) {
			e.printStackTrace();
		}

			return false;}

	@Override
	public List<RegisterBean> fetch() {
		//RegisterBean rbo = new RegisterBean();
		//List<RegisterBean>list1=null;
		try {
			//list=new ArrayList<RegisterBean>();
con=CreateConnection.openConnection();
Statement st=con.createStatement();
rs=st.executeQuery("select * from register");
while(rs.next()) {
RegisterBean	rbo=new RegisterBean();
	rbo.setUsername(rs.getString(2));
	rbo.setPassword(rs.getString(3));
	rbo.setPhoneNumber(rs.getString(4));
	list.add(rbo);
}
	Iterator<RegisterBean>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+"creating object");
	}
System.out.println(list);
con.close();
		}catch (Exception e) {
e.printStackTrace();
		}
		return list;
	}
	}
