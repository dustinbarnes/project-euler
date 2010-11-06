package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=30
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Problem30Test
{
    private Problem30 problem30 = new Problem30();

    @Test
    public void testSumOfNumbersForProblemProblem() throws Exception
    {
        assertThat(problem30.sumOfNumbersForProblem(5), equalTo(443839));
    }

    @Test
    public void testSumOfNumbersForProblemGiven() throws Exception
    {
        assertThat(problem30.sumOfNumbersForProblem(4), equalTo(19316));
    }
}
