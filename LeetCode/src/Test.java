import java.util.Calendar;
import java.util.Date;
 
public class Test {
 
	public static void main (String args[]) {
	
		System.out.println (getSecondSundayOfMarch());
		System.out.println (getFirstSundayOfNovember());
		
	}
 
	public static final Date getSecondSundayOfMarch () {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.setFirstDayOfWeek(Calendar.SUNDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.set(Calendar.WEEK_OF_MONTH,2);
		return cal.getTime();
	}
	
	public static final Date getFirstSundayOfNovember () {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.setFirstDayOfWeek(Calendar.SUNDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.set(Calendar.WEEK_OF_MONTH,1);
		return cal.getTime();
	}
	
}