package net.projecteuler.dustinbarnes.problem16;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
public class Problem16Test
{
    private Problem16 problem16 = new Problem16();
    @Test
    public void testGiven()
    {
        assertThat(problem16.sumOfDigitsOfPowerOfTwo(15), equalTo(26));
    }

    @Test
    public void testProblem()
    {
        assertThat(problem16.sumOfDigitsOfPowerOfTwo(1000), equalTo(1366));
    }
}
