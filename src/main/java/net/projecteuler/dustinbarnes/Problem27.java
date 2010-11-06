package net.projecteuler.dustinbarnes;

import java.util.List;

import net.projecteuler.dustinbarnes.primes.EulersSieve;


/**
 * http://projecteuler.net/index.php?section=problems&id=27
 *
 * n? + an + b, where |a| < 1000 and |b| < 1000
 *
 * Find the product of the coefficients, a and b, for the quadratic
 * expression that produces the maximum number of primes for consecutive
 * values of n, starting with n = 0.
 */
public class Problem27 extends ProjectEulerSolution
{
    public static final int MIN_A = -1000;
    public static final int MAX_A = 1000;

    public static final int MIN_B = -1000;
    public static final int MAX_B = 1000;

    private static final List<Integer> PRIMES = EulersSieve.generatePrimes(10000);

    public int solve()
    {
        int mostPrimes = -1;
        int mostPrimesA = 0;
        int mostPrimesB = 0;

        for ( int a = MIN_A; a < MAX_A; a++ )
        {
            for ( int b = MIN_B; b < MAX_B; b++ )
            {
                int numPrimes = countPrimes(a, b);
                if ( numPrimes > mostPrimes )
                {
                    mostPrimes = numPrimes;
                    mostPrimesA = a;
                    mostPrimesB = b;
                }
            }
        }

        log("Solution: a=" + mostPrimesA + ", b=" + mostPrimesB + ", numPrimes=" + mostPrimes);
        return mostPrimesA * mostPrimesB;
    }

    public int countPrimes(int a, int b)
    {
        int numPrimes = 0;

        int i = 0;
        while ( PRIMES.contains(calculateQuadratic(a, b, i++)) )
        {
            numPrimes++;
        }

        return numPrimes;
    }

    private Integer calculateQuadratic(int a, int b, int n)
    {
        return ((n*n) + (a*n) + b);
    }
}
