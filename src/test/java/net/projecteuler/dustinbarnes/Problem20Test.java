package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=20
 *
 * n! means n * (n  1) * ... * 3 * 2 * 1
 * Find the sum of the digits in the number 100!
 */
public class Problem20Test
{
    Problem20 problem20 = new Problem20();

    @Test
    public void testSumOfDigitsInFactorial() throws Exception
    {
        assertThat(problem20.sumOfDigitsInFactorial(100), equalTo(648L));
    }
}
