package net.projecteuler.dustinbarnes.problem5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * http://projecteuler.net/index.php?section=problems&id=5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5Test
{
    private final Problem5 problem5 = new Problem5();

    @Test
    public void testSolveGivenBruteForce() throws Exception
    {
        assertEquals(2520, problem5.solveBruteForce(10));
    }

    @Test
    public void testSolveChallengeBruteForce() throws Exception
    {
        assertEquals(232792560, problem5.solveBruteForce(20));
    }
}
