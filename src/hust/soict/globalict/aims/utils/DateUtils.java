package hust.soict.globalict.aims.utils;
import java.util.Date;
public class DateUtils {

	public static void compareDates(Date date1,Date date2) {
	if (date1.compareTo(date2) > 0) {
	    System.out.println("Date1 is after Date2");
	} else if (date1.compareTo(date2) < 0) {
	    System.out.println("Date1 is before Date2");
	} else {
	    System.out.println("Date1 is equal to Date2");
	}
}
	public static void sortDates(Date[] dateList) {
			for(int i=0;i<dateList.length-1;i++) {
				for(int j=i+1;j<dateList.length;j++)
					if((dateList[i].compareTo(dateList[j]))>0) {
							Date tmp=dateList[i];
							dateList[i]=dateList[j];
							dateList[j]=tmp;
					}
			}
			
		
	}
}
