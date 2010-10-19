package net.projecteuler.dustinbarnes;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * http://projecteuler.net/index.php?section=problems&id=19
 *
 * How many Sundays fell on the first of the month during the
 * twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem19
{
    Calendar endDate = new GregorianCalendar(2000, Calendar.DECEMBER, 31);
    Calendar startDate = new GregorianCalendar(1901, Calendar.JANUARY, 1);

    public int numberOfSundaysOnFirstOfMonth()
    {
        Calendar current = (Calendar) startDate.clone();
        int counter = 0;

        while ( current.before(endDate) )
        {
            if ( current.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY )
            {
                counter++;
            }

            current.add(Calendar.MONTH, 1);
        }

        return counter;
    }
}
