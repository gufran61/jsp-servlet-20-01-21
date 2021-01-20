package com.creatingConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	static Connection connection ;
	
public static Connection openConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletProject","root","root");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return connection;	
}
}
