package net.projecteuler.dustinbarnes.problem7;

import java.util.List;

import net.projecteuler.dustinbarnes.primes.EulersSieve;


/**
 * http://projecteuler.net/index.php?section=problems&id=7
 *
 * What is the 10001st prime number?
 */
public class Problem7
{
    public int findPrime(int guessForMax)
    {
        List<Integer> primes = EulersSieve.generatePrimes(guessForMax);
        return primes.get(10000);
    }
}
