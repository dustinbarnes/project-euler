package net.projecteuler.dustinbarnes.problem10;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=10
 *
 * Find the sum of all the primes below two million.
 */
public class Problem10Test
{
    Problem10 problem10 = new Problem10();

    @Test
    public void testSumOfPrimesBelowGiven() throws Exception
    {
        assertThat(problem10.sumOfPrimesBelow(10), equalTo(17L));
    }

    @Test
    public void testSumOfPrimesBelowProblem() throws Exception
    {
        assertThat(problem10.sumOfPrimesBelow(2000000), equalTo(142913828922L));
    }
}
