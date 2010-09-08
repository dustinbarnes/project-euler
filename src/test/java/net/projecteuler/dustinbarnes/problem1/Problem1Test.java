package net.projecteuler.dustinbarnes.problem1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem1Test
{
    private static final int EXPECTED = 233168;

    @Test
    public void testCalculateSumBruteForce() throws Exception
    {
        Problem1 problem1 = new Problem1();
        assertEquals(EXPECTED, problem1.calculateSumBruteForce());
    }
}
