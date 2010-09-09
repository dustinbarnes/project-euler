package net.projecteuler.dustinbarnes.problem2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * http://projecteuler.net/index.php?section=problems&id=3
 *
 * Find the sum of all the even-valued terms in the sequence
 * which do not exceed four million.
 */
public class Problem2Test
{
    private static final long EXPECTED = 4613732;

    @Test
    public void testSolve() throws Exception
    {
        Problem2 problem2 = new Problem2();
        assertEquals(EXPECTED, problem2.solve());
    }
}
