package net.projecteuler.dustinbarnes.problem3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * Because of size, this test must be run with a heap size around 768m 
 */
public class Problem3Test
{
    private Problem3 problem3;

    @Before
    public void setup()
    {
        problem3 = new Problem3();
    }

    @Test
    public void testLargestPrimeFactorGiven() throws Exception
    {
        assertThat(problem3.largestPrimeFactor(13195L), equalTo(29));
    }

    @Test
    public void testLargestPrimeFactorProblem() throws Exception
    {
        assertThat(problem3.largestPrimeFactor(600851475143L), equalTo(6857));
    }
}
