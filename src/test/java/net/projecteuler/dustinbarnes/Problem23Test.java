package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=23
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
public class Problem23Test
{
    private Problem23 problem23 = new Problem23();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(problem23.solve(), equalTo(4179871L));
    }
}
