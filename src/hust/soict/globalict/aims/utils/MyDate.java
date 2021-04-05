package hust.soict.globalict.aims.utils;

import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class MyDate {
	private int day, month, year;
	private String strDay,strMonth,strYear;
	
	public boolean ValidateDate() {
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		cal.set(year, month - 1, day);
		try {
		    cal.getTime();
		}
		catch (Exception invalidateDate) {
		  return false;
		}
		return true;
	}

	public MyDate(){
		Date curDate = new Date();		
		day = curDate.getDate();
		month = curDate.getMonth() + 1;
		year = curDate.getYear() + 1900;
	}


	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		if (!ValidateDate()) System.out.println("Invalid date!");
	}

	private void getDatefromString(String S) {
		String[] date =S.split("\\s");
		String MONTH =date[0];
		if (MONTH.equals("January"))  month = 1;if (MONTH.equals("February"))  month = 2;if (MONTH.equals("March"))  month = 3;
		if (MONTH.equals("April"))  month = 4;if (MONTH.equals("May"))  month = 5; if (MONTH.equals("June"))  month = 6;
		if (MONTH.equals("July"))  month = 7;if (MONTH.equals("August"))  month = 8;if (MONTH.equals("September"))  month = 9;
		if (MONTH.equals("October"))  month = 10; if (MONTH.equals("November"))  month = 11; if (MONTH.equals("Demcember"))  month = 12;
		String day1=date[1];
		if(day1.length()==3)
			day=Integer.parseInt(day1.substring(0, 1));
		else
			day=Integer.parseInt(day1.substring(0, 2));
		year= Integer.parseInt(date[2]);
		if (!ValidateDate()) System.out.println("Invalid date!");
	}
	public MyDate(String S) {
		getDatefromString(S);
	}
	public MyDate(String day,String month,String year) {
		this.strDay =day;
		this.strMonth=month;
		this.strYear= year;
		
	}
	public void accept() {
		System.out.println("Enter a date from the keyboard(Month Day Year):");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		getDatefromString(date);
	}
	public void printf() {
		if (ValidateDate()) System.out.println("Date: " + day + "/" + month + "/" + year);
	}
	public void print() {
		Date date = new Date(this.year-1900,this.month-1,this.day);
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy");  
		String strDate = formatter.format(date);  
	    System.out.println(strDate);  
	    
	}
	public void print(String dateFormat) {
		Date date = new Date(this.year-1900,this.month-1,this.day);
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);  
		String strDate = formatter.format(date);  
	    System.out.println(strDate);  
		
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

