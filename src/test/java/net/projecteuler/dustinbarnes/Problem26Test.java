package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=26
 *
 * Find the value of d < 1000 for which 1/d contains the longest
 * recurring cycle in its decimal fraction part.
 */
public class Problem26Test
{
    private Problem26 problem26 = new Problem26();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(problem26.solve(), equalTo(983));
    }

    @Test
    public void testGetRecurrence() throws Exception
    {
        assertRecurrence(2, "");
        assertRecurrence(3, "3");
        assertRecurrence(6, "6");
        assertRecurrence(7, "142857");
    }

    @Test
    public void testGetRecurrenceWithProblemChild() throws Exception
    {
        String result = problem26.getSanitizedValue(46);
        String recur = problem26.getRecurrence(result);
        assertThat(recur.length(), equalTo(22));
    }

    private void assertRecurrence(int denominator, String recurrence)
    {
        String result = problem26.getSanitizedValue(denominator);
        String recur = problem26.getRecurrence(result);

        assertThat(recur, equalTo(recurrence));
    }
}
