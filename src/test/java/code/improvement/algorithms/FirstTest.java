package code.improvement.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class FirstTest {

    @Test
    public void firstTest() {
        Assert.assertEquals("a", "a");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0); // ! clear would not reset the hour of day !
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MILLISECOND);
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        System.out.println("Start of this week:       " + cal.getTime());
        System.out.println("... in milliseconds:      " + cal.getTimeInMillis());

        TimeZone UTC = TimeZone.getTimeZone("UTC");
        Calendar cal1 = Calendar.getInstance(UTC);
        cal1.set(Calendar.MILLISECOND, 0);
        cal1.set(Calendar.SECOND, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.HOUR_OF_DAY, 0);
        cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        System.out.println("... in milliseconds:      " + cal1.getTime());
        System.out.println("... in milliseconds:      " + cal1.getTimeInMillis());
    }

}
