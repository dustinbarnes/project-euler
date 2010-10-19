package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=19
 *
 * How many Sundays fell on the first of the month during the
 * twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem19Test
{
    @Test
    public void testNumberOfSundaysOnFirstOfMonth() throws Exception
    {
        assertThat(new Problem19().numberOfSundaysOnFirstOfMonth(), equalTo(171));
    }
}
