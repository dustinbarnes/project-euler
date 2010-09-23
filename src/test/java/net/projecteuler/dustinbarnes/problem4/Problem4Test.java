package net.projecteuler.dustinbarnes.problem4;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=4
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 ? 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4Test
{
    Problem4 problem4 = new Problem4();

    @Test
    public void testGiven()
    {
        Problem4Response given = new Problem4Response(9009, 99, 91);
        assertThat(problem4.getLargestPalindrome(2), equalTo(given));
    }

    @Test
    public void testProblem()
    {
        Problem4Response given = new Problem4Response(906609, 993, 913);
        assertThat(problem4.getLargestPalindrome(3), equalTo(given));
    }
}
