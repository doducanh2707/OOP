package hust.soict.globalict.test.utils;
import java.util.Date;

import hust.soict.globalict.aims.utils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate;

import java.util.Calendar;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate date = new MyDate(25,5,2021);
		//date.print();
		//date.print("d/M/yyyy");
		//date.print("yyyy-MM-dd");
		//date.print("dd-MMM-yyyy");
		//date.print("MMM d yyyy");
		//date.print("MM-dd-yyyy");
		Date date1 = new Date(2020-1900,2-1,15);
		Date date2 = new Date(2020-1900,3-1,17);
		Date dateList[]= new Date[4];
		//DateUtils.compareDates(date1, date2);
		dateList[0]= new Date(2020-1900,2-1,15);
		dateList[1]=new Date(2020-1900,3-1,17);
		dateList[2]= new Date(2018-1900,4-1,24);
		dateList[3]=new Date(2021-1900,5-1,3);
		DateUtils.sortDates(dateList);
		for(int i=0;i<dateList.length;i++)
			System.out.println(dateList[i]);
	}


}
