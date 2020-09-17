package com.assg6;

import java.util.List;


//measure you time you take..
public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insert logic.
		DAO d =new DAO();
		
//		int accno=myconsole.getInt("Enter the the Account number");
//		int accpin = myconsole.getInt("Enter the account pin");
//		int accbalance = myconsole.getInt("Enter the account balance");
//		
//		Acc c =new Acc(accno,accpin,accbalance);
//		boolean x = d.insert(c);
//		
//		  if(!x) { System.out.println("The insertion done successfully"); }
		 
		
		//update logic, assume 234 and 456 was updated details got from the user.
//		  int accno=myconsole.getInt("Enter the accno to edit");
//		  int accpin = myconsole.getInt("Ente the accpin");
//		  int accbalance = myconsole.getInt("Ente the accbalance");
//		  Acc ac = new Acc(accno,accpin,accbalance);
//	     boolean x1 = d.update(ac);
//		if(!x1)
//		{
//			System.out.println("The Updation has been done Successfully");
//		}
		
		//single select.
//		int acc =1;
//		List<Acc> c = d.getAccDetails(acc);
//		if(ac.getBalance() == -1)
//			System.out.println("account no not found");
//		else
//			System.out.println("account details found"  );
		//you think how to print acount details..
		 
		
		
		//for getting details
		
//		int accnumber=myconsole.getInt("Enter the ACCOUNT NUMBER you want to get the details");
//		Acc a = new Acc(accnumber);
//		List<Acc> b1= d.getAccDetails(accnumber);
//		List<Acc> data = null;
//		
		
		
		
		// multi select.
	
		
		int accbalance=myconsole.getInt("Enter the Amount to gretter than: ");	
		Acc a = new Acc(0,accbalance);
	List<Acc> b1= d.getAccOnBalance(accbalance);
		List<Acc> data = null;
	
		
		
					
		
		
		

	}

}
