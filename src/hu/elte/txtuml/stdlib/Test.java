package hu.elte.txtuml.stdlib;

import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args)  {
		////hu.elte.txtuml.stdlib.CalendarImplimentation calendar = new CalendarImplimentation();
		   Calendar cal = Calendar.getInstance();
		System.out.println("The current date is : " + cal.getTime());
		// add 20 days to the calendar
		   cal.add(Calendar.DATE, 20);
		   System.out.println("20 days later: " + cal.getTime());
		
		   Calendar cal1 = Calendar.getInstance();
			 Calendar future = Calendar.getInstance();
			// TODO Auto-generated method stub
			 // change year in future calendar
			   future.set(Calendar.YEAR, 2016);
			   System.out.println("Year is " + future.get(Calendar.YEAR));
			   Date time = future.getTime();
			   if (future.after(cal1)) {
			   System.out.println("Date " + time + " is after current date.");	
			   
			   
	
			   }
	}
}
