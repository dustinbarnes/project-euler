package net.projecteuler.dustinbarnes.problem3;

import java.util.List;

import net.projecteuler.dustinbarnes.primes.EulersSieve;


/**
 * http://projecteuler.net/index.php?section=problems&id=3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3
{
    public int largestPrimeFactor(long number)
    {
        List<Integer> primes = generatePrimesUpToSquareRootOf(number);
        int largestPrimeFactor = 2;

        for ( Integer prime : primes )
        {
            if ( number % prime == 0 && prime > largestPrimeFactor )
            {
                largestPrimeFactor = prime;
            }
        }

        return largestPrimeFactor;
    }

    private List<Integer> generatePrimesUpToSquareRootOf(long number)
    {
        long sqrt = computeSquareRoot(number);
        return EulersSieve.generatePrimes((int)sqrt);
    }

    /* Because Math.sqrt doesn't support longs, we have to sort of brute force it. */
    private long computeSquareRoot(long number)
    {
        int lo = 0;
        long hi = number / 2;
        return computeSquareRootRecursive(number, (hi + lo)/2, hi, lo);
    }

    private long computeSquareRootRecursive(long number, long lastGuess, long hi, long lo)
    {
        if ( hi - lo <= 1)
        {
            return lastGuess;
        }
        else
        {
            if ( lastGuess * lastGuess == number )
            {
                return lastGuess;
            }
            else if ( lastGuess*lastGuess < number )
            {
                lo = lastGuess;
                return computeSquareRootRecursive(number, (hi + lo)/2, hi, lo);
            }
            else
            {
                hi = lastGuess;
                return computeSquareRootRecursive(number, (hi + lo)/2, hi, lo);
            }
        }
    }
}
