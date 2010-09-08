package net.projecteuler.dustinbarnes.problem2;

/**
 * http://projecteuler.net/index.php?section=problems&id=2
 *
 * Find the sum of all the even-valued terms in the sequence
 * which do not exceed four million.
 */
public class Problem2
{
    private static final long MAX = 4000000;

    public long solve()
    {
        long num1 = 1;
        long num2 = 1;
        long accumulator = 0;

        while ( num2 < MAX )
        {
            if ( isEven(num2) )
            {
                accumulator += num2;
            }

            long temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }

        return accumulator;
    }

    private boolean isEven(long num)
    {
        return (num % 2 == 0);
    }
}
