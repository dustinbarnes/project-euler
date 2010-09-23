package net.projecteuler.dustinbarnes.primes;

import java.util.List;


public final class PrimeNumberHelper
{
    // Util Class
    private PrimeNumberHelper()
    {
    }

    /**
     * I know, this is an abysmal checking algo.
     * @param num number to check
     * @return primeness
     */
    public boolean isPrime(int num)
    {
        int max = (int)Math.floor(Math.sqrt(num));
        boolean isPrime = true;

        for ( int i = 2; i <= max; i++ )
        {
            if ( num % i != 0)
            {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static List<Integer> generatePrimes(int maxValue)
    {
        return EulersSieve.generatePrimes(maxValue);
    }
}
