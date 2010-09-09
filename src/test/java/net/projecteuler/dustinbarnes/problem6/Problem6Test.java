package net.projecteuler.dustinbarnes.problem6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem6Test
{
    private final long EXPECTED_100 = 25164150L;
    private final long EXPECTED_10 = 2640L;

    @Test
    public void testGetDifferenceGivenBruteForce() throws Exception
    {
        Problem6 problem6 = new Problem6();
        assertEquals(EXPECTED_10, problem6.getDifferenceBruteForce(10));
    }

    @Test
    public void testGetDifferenceChallengeBruteForce() throws Exception
    {
        Problem6 problem6 = new Problem6();
        assertEquals(EXPECTED_100, problem6.getDifferenceBruteForce(100));
    }

    @Test
    public void testGetDifferenceGivenSmart() throws Exception
    {
        Problem6 problem6 = new Problem6();
        assertEquals(EXPECTED_10, problem6.getDifferenceSmart(10));
    }

    @Test
    public void testGetDifferenceChallengeSmart() throws Exception
    {
        Problem6 problem6 = new Problem6();
        assertEquals(EXPECTED_100, problem6.getDifferenceSmart(100));
    }
}
