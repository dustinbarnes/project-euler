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

        if ( num % 2 == 0 )
        {
            isPrime = false;
        }
        else
        {
            for ( int i = 3; i <= max; i+=2 )
            {
                if ( num % i != 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static List<Integer> generatePrimes(int maxValue)
    {
        return EulersSieve.generatePrimes(maxValue);
    }
}
