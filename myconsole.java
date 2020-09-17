package com.assg6;




import java.util.Date;
import java.util.Scanner;


public class myconsole
{
	private myconsole() {}
	public static String getString(String question)
	{
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static int getInt(String question)
	{
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static double getDouble(String question)
	{
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	public static Date getDate()
	{
		int dd =  getInt("Enter the day of the month");
		int mm = getInt("Enter the month from 1 to 12");
		int yyyy =  getInt("Enter the year as yyyy");
		return new Date(yyyy-1900,mm-1,dd);
	}
////////////////////////// User convienece Print program/////////////////////////////////////
	public static void print(Object question) {
		System.out.println(question);               //Instead of length "System.out.println(Question);"
	}												//U can use  "myconsole.print(question);"

	public static String scan(Object question) {
		myconsole.print(question);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
		
	}
}
