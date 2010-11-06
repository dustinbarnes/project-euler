package net.projecteuler.dustinbarnes;

import java.util.HashMap;
import java.util.Map;


/**
 * http://projecteuler.net/index.php?section=problems&id=30
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Problem30 extends ProjectEulerSolution
{
    // I have no real basis for 6 digits maximum. It just seemed to work.
    private static final int MAX = 999999;
    private static final int MIN = 11;

    private Map<String, Integer> powers = new HashMap<String, Integer>(11);

    public int sumOfNumbersForProblem(int power)
    {
        populatePowersCache(power);
        int accumulator = 0;

        for ( int number = MIN; number <= MAX; number++ )
        {
            int result = calculateSumOfPowersOfDigits(number);
            if ( result == number )
            {
                accumulator += result;
                log("Found solution:", number);
            }
        }

        return accumulator;
    }

    private int calculateSumOfPowersOfDigits(int number)
    {
        String numberAsString = ""+number;
        int accumulator = 0;

        for ( int i = 0; i < numberAsString.length(); i++ )
        {
            String digit = numberAsString.substring(i, i+1);
            accumulator += powers.get(digit);
        }

        return accumulator;
    }

    private void populatePowersCache(int power)
    {
        for ( int i = 0; i <= 9; i++ )
        {
            powers.put(""+i, (int)Math.pow(i, power));
        }
    }
}
