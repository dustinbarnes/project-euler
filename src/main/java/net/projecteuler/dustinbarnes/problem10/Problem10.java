package net.projecteuler.dustinbarnes.problem10;

import java.util.List;

import net.projecteuler.dustinbarnes.primes.EulersSieve;


/**
 * http://projecteuler.net/index.php?section=problems&id=10
 *
 * Find the sum of all the primes below two million.
 */
public class Problem10
{
    public long sumOfPrimesBelow(int max)
    {
        List<Integer> primesBelowMax = EulersSieve.generatePrimes(max);
        long accumulator = 0;
        for ( Integer value : primesBelowMax )
        {
            accumulator += value;
        }
        return accumulator;
    }
}
