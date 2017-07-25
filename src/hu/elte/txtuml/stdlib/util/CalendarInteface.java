package hu.elte.txtuml.stdlib;
import hu.elte.txtuml.api.model.external.ExternalClass;


public interface CalendarInteface extends ExternalClass {
	/*Following is the declaration for java.util.Calendar.add() method*/

public void add(int field, int amount) ;



/* declaration for java.util.Calendar.after() method */
public boolean after(Object when) ;



/*  declaration for java.util.Calendar.before() method */
public boolean before(Object when);


/*declaration for java.util.Calendar.clear() method*/ 
public void clear();


public void clear(int field);


/*declaration for java.util.Calendar.clear() method which clear the calender */
public int compareTo(CalendarInteface anotherCalendar);


/*	The java.util.Calendar.compareTo() method compares the time values (millisecond offsets) between the Calendar object and anotherCalendar object.*/
public boolean equals(Object obj); 

/*The java.util.Calendar.equals() method compares this Calendar to the specified Object.
 *declaration for java.util.Calendar.equals() method*/

}
