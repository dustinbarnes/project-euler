package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=24
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Problem24Test
{
    private Problem24 problem24 = new Problem24();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(problem24.solve(), equalTo("2783915460"));
    }
}
