package com.assg6;



public class Acc {
	
	private int accno,accpin,accbalance;

	public int getAccno() {
		return accno;
	}

	public void setAcno(int accno) {
		this.accno = accno;
	}

	public int getPin() {
		return accpin;
	}

	public void setPin(int accpin) {
		this.accpin = accpin;
	}

	public int getBalance() {
		return accbalance;
	}

	public void setBalance(int accbalance) {
		this.accbalance = accbalance;
	}

	public Acc(int accno, int accpin, int accbalance) {
	
		this.accno = accno;
		this.accpin = accpin;
		this.accbalance = accbalance;
	}
	public Acc( int accpin, int accbalance) {//for updation?
		this.accpin = accpin;
		this.accbalance = accbalance;
	}
	public Acc(int accno)
	{
		this.accno=accno;
	}
	

	public Acc() {
		
		// TODO Auto-generated constructor stub
	}
	
	public  String toString()
	{
		return String.format("The Accno is %d\n the Account pin is %d\n the balanceamount is %d", this.accno,this.accpin,this.accbalance);
		
	}
	
	

}
