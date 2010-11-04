package net.projecteuler.dustinbarnes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;


/**
 * http://projecteuler.net/index.php?section=problems&id=23
 *
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
public class Problem23 extends ProjectEulerSolution
{
    public static final int MAX = 28123;
    private Map<Integer, Boolean> abundants = new HashMap<Integer, Boolean>(MAX);

    public long solve()
    {
        calculateAbundantNumbers();

        long accumulator = 0;

        for ( int i = 0; i < MAX; i++ )
        {
            if ( !couldBeExpressedAsSumOfTwoAbundants(i) )
            {
                accumulator += i;
            }
        }

        return accumulator;
    }

    private boolean couldBeExpressedAsSumOfTwoAbundants(int number)
    {
        for ( int i = number-1; i > 0; i-- )
        {
            int j = number-i;

            if ( abundants.get(i) && abundants.get(j) )
            {
                return true;
            }
        }

        return false;
    }

    private void calculateAbundantNumbers()
    {
        for ( int i = 1; i <= MAX; i++ )
        {
            List<Integer> factors = EulerProjectMath.properDivisors(i);
            long sum = EulerProjectMath.sum(factors);
            abundants.put(i, (sum > i));
        }
    }
}
