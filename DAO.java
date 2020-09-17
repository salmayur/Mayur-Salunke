package com.assg6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	
	
	////////////////QUERIES////////////////////////
	private static final String insertacc = "INSERT INTO acc(acc, pin, balance) VALUES(?,?,?)";
	private static final String updateacc = "UPDATE acc SET pin = ? , balance = ? WHERE acc = ?";
	private static final String getdetails = "SELECT * FROM acc WHERE acc=? ";
	private static final String getbalance ="SELECT * FROM acc WHERE balance>?";
	/////////////////////////////////////////////////////////////////////////////////////
	

	private String url="jdbc:mysql://localhost/bank" ;
	private String user="root";
	private String pwd="root";
	private String driverClassName= "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String driverClassName)
	{
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return con;
	}
	
	
	

	public boolean insert(Acc c) {
		try {
			loadDriver(driverClassName);
			Connection con=  getConnection();
			if(con!=null) {
			System.out.println("the connection has been established");
			
			
			PreparedStatement ps = con.prepareStatement(insertacc);
			ps.setInt(1,c.getAccno());
			ps.setInt(2,c.getPin());
			ps.setInt(3,c.getBalance());
			myconsole.print("Entry Successful...!!!");
			ps.execute();
			myconsole.print("the data is in db");
			con.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(Acc ac) {
		try {
			loadDriver(driverClassName);
			Connection con=  getConnection();
			if(con!=null) {
			System.out.println("the connection has been established");
			PreparedStatement ps = con.prepareStatement(updateacc);
			ps.setInt(3,ac.getAccno());
			ps.setInt(1,ac.getPin());
			ps.setInt(2,ac.getBalance());
			System.out.println("here the data has been taken");
			ps.execute();
			System.out.println("the data has been relecting into the db");
			con.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
			
			
			
		
	}


//single select query based on primary key
	public List<Acc> getAccDetails(int accno) {
		
		try {
			loadDriver(driverClassName);
			Connection con = getConnection();
			System.out.println("the connection has just made");
			if(con!=null)
			{
				System.out.println("The connection has been Established");
				PreparedStatement ps= con.prepareStatement(getdetails);
				ps.setInt(1,accno);
				ResultSet rs= ps.executeQuery();
				List<Acc> data = getaccdetails(rs);
				System.out.println("The details of requested Acc number is");
				for(Acc item: data)
				{
					if(item.getBalance()==-1)
					{
						System.out.println("The balance is 0");
					}
					System.out.println(item);
				}
				con.close();
				return data;
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}


	/*public List<Acc> getAccOnBalance(int balance) {
		// TODO Auto-generated method stub
		
		//return List as empty list in case you find no account with balance
		//greater than input balance
		return null;
	}*/
	
	public List<Acc> getAccOnBalance(int accbalance)
	{
		try {
			loadDriver(driverClassName);
			Connection con = getConnection();
			myconsole.print("the connection has just made");
			if(con!=null)
			{
				myconsole.print("The connection has been Established");
				PreparedStatement ps= con.prepareStatement(getbalance);
				//int accnobalance;
				ps.setInt(1,accbalance);
				ResultSet rs= ps.executeQuery();
				List<Acc> data = getaccdetails(rs);
				myconsole.print("The balance greater than given amount is");
				for(Acc item: data)
				{
					
					System.out.println(item);
				}
				con.close();
				return data;
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	private List<Acc> getaccdetails(ResultSet rs)
	{
		List<Acc> Acc = new ArrayList<Acc>();
		try
		{
			while(rs.next())
			{
				int accno = rs.getInt(1);
				int accpin = rs.getInt(2);
				int accbalance = rs.getInt(3);
				Acc accc = new Acc(accno,accpin,accbalance);
				Acc.add(accc);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Acc;
	}

}

