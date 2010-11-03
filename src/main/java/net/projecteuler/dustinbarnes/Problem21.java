package net.projecteuler.dustinbarnes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;


/**
 * http://projecteuler.net/index.php?section=problems&id=21
 *
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each
 * of a and b are called amicable numbers.
 *
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
 * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 *
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem21 extends ProjectEulerSolution
{
    private static final int MAX = 10000;

    private Map<Integer, Integer> sumOfProperDivisors = new HashMap<Integer, Integer>(MAX);

    public long solve()
    {
        long accumulator = 0;
        for ( int i = 1; i < MAX; i++ )
        {
            if ( isAmicablePair(i) )
            {
                accumulator += i;
            }
        }

        return accumulator;
    }

    private boolean isAmicablePair(int num)
    {
        boolean isAmicable = false;
        int sumOfDivisors = getSumOfProperDivisors(num);

        if ( sumOfDivisors <= MAX && num != sumOfDivisors )
        {
            Integer otherSumOfDivisors = getSumOfProperDivisors(sumOfDivisors);
            isAmicable = (otherSumOfDivisors == num);
        }

        return isAmicable;
    }

    private int getSumOfProperDivisors(int number)
    {
        if ( !sumOfProperDivisors.containsKey(number) )
        {
            List<Integer> divisors = EulerProjectMath.properDivisors(number);

            int accumulator = 0;
            for ( Integer num : divisors )
            {
                accumulator += num;
            }

            sumOfProperDivisors.put(number, accumulator);

            return accumulator;
        }

        return sumOfProperDivisors.get(number);
    }
}
