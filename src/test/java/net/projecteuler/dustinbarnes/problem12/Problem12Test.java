package net.projecteuler.dustinbarnes.problem12;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=12
 *
 * The sequence of triangle numbers is generated by adding the
 * natural numbers. So the 7th triangle number would be
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem12Test
{
    private Problem12 problem12 = new Problem12();


    @Test
    public void testTriangleNumberWithDivisorCountGiven() throws Exception
    {
        assertThat(problem12.triangleNumberWithDivisorCount(1), equalTo(1));
        assertThat(problem12.triangleNumberWithDivisorCount(4), equalTo(6));
        assertThat(problem12.triangleNumberWithDivisorCount(6), equalTo(28));
    }

    // Warning: can take 15+ minutes to run. 
    @Test
    public void testTriangleNumberWithDivisorCountProblem() throws Exception
    {
        assertThat(problem12.triangleNumberWithDivisorCount(500), equalTo(76576500));
    }
}
