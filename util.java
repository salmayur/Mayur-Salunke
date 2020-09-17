package com.assg6;

import java.sql.*;

public class util {

	//func for getting connection 
	
	private static String driverClassName,url,user,pwd;

	static
	{
		driverClassName= "com.mysql.cj.jdbc.Driver";
		url= "jdbc:mysql://localhost/bank";
		user = "root";
		pwd = "root";
	}
	public static Connection getConnection()throws SQLException,ClassNotFoundException{
		Class.forName(driverClassName);
		Connection con= DriverManager.getConnection(url, user, pwd);
		return con;
		
	}

}

