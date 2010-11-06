package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=27
 *
 * n? + an + b, where |a| < 1000 and |b| < 1000
 *
 * Find the product of the coefficients, a and b, for the quadratic
 * expression that produces the maximum number of primes for consecutive
 * values of n, starting with n = 0.
 */
public class Problem27Test
{
    private Problem27 problem27 = new Problem27();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(problem27.solve(), equalTo(-59231));
    }

    @Test
    public void testCountPrimes() throws Exception
    {
        assertThat(problem27.countPrimes(1, 41), equalTo(40));
        assertThat(problem27.countPrimes(-79, 1601), equalTo(80));
    }
}
