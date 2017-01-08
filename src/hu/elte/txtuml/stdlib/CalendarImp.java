package hu.elte.txtuml.stdlib;
import java.util.Calendar;

public class CalendarImp implements CalendarInteface{
 

@Override
public void add(int field, int amount) {
	// *field -- the calendar field 
	//*amount --the amount of date or time to be added to the field.*/
	Calendar cal = Calendar.getInstance();
    cal.add(field,amount);
}

@Override
public boolean after(Object when) {
	Calendar cal = Calendar.getInstance();
    Calendar fut = Calendar.getInstance();
 // check if calendar date is after current date
    return fut.after(cal);
}

@Override
public boolean before(Object when) {
	Calendar cal = Calendar.getInstance();
	Calendar past = Calendar.getInstance();
// check if calendar date is before current date
	 return cal.before(past);
}

@Override
public void clear() {
	   Calendar cal = Calendar.getInstance();
// use clear method to set all field values and time value as undefined.
	   cal.clear();
}

@Override
public void clear(int field) {
	   Calendar cal = Calendar.getInstance();
// use clear method to set field as undefined.
	   cal.clear(field);
	
}
@Override
public int compareTo(CalendarInteface anotherCalendar){
// compare the time values represented by two calendar objects.

	CalendarInteface cal = null;
	return anotherCalendar.compareTo(cal);

}
}
