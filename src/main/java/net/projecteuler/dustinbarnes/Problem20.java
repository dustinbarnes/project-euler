package net.projecteuler.dustinbarnes;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;


/**
 * http://projecteuler.net/index.php?section=problems&id=20
 *
 * n! means n * (n  1) * ... * 3 * 2 * 1
 * Find the sum of the digits in the number 100!
 */
public class Problem20
{
    public long sumOfDigitsInFactorial(int factorial)
    {
        String factorialString = EulerProjectMath.factorial(factorial).toString();

        long accumulator = 0;

        for ( int i = 0; i < factorialString.length(); i++ )
        {
            accumulator += Integer.parseInt(factorialString.substring(i, i+1));
        }

        return accumulator;
    }
}
