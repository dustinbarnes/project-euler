package net.projecteuler.dustinbarnes.primes;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class EulersSieveTest
{
    @Test
    public void testGeneratePrimes() throws Exception
    {
        // We know the primes under 100...
        List<Integer> knownPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

        List<Integer> primes = EulersSieve.generatePrimes(100);

        assertThat(primes.size(), equalTo(knownPrimes.size()));
        assertThat(primes.containsAll(knownPrimes), equalTo(true));
    }
}
