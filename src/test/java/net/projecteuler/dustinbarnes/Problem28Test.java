package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=27
 *
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class Problem28Test
{
    private Problem28 problem28 = new Problem28();

    @Test
    public void testSumOfDiagonalsInSpiralProblem() throws Exception
    {
        assertThat(problem28.sumOfDiagonalsInSpiral(1001), equalTo(669171001));
    }

    @Test
    public void testSumOfDiagonalsInSpiralGiven() throws Exception
    {
        assertThat(problem28.sumOfDiagonalsInSpiral(5), equalTo(101));
    }
}
