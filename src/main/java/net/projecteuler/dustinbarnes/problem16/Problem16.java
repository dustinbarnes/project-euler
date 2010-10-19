package net.projecteuler.dustinbarnes.problem16;

import java.math.BigInteger;


/**
 * http://projecteuler.net/index.php?section=problems&id=16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
public class Problem16
{
    int sumOfDigitsOfPowerOfTwo(int power)
    {
        BigInteger base = new BigInteger("2");
        BigInteger result = base.pow(power);
        String representation = result.toString();
        
        int accumulator = 0;

        for ( int i = 0; i < representation.length(); i++ )
        {
            accumulator += Integer.parseInt("" + representation.charAt(i));
        }

        return accumulator;
    }
}
