package net.projecteuler.dustinbarnes.problem1;

/**
 * http://projecteuler.net/index.php?section=problems&id=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1
{
    private static final int MAX = 1000;

    public int calculateSumBruteForce()
    {
        int accumulator = 0;

        for ( int i = 1; i < MAX; i++ )
        {
            if ( isFactor(i) )
            {
                accumulator += i;
            }
        }

        return accumulator;
    }

    private boolean isFactor(int number)
    {
        return (number % 5 == 0 || number % 3 == 0);
    }
}
