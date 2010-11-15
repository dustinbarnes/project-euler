package net.projecteuler.dustinbarnes.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public final class EulerProjectMath
{
    private EulerProjectMath()
    {
    }

    public static BigInteger factorial(int num)
    {
        BigInteger accumulator = new BigInteger("1");

        for ( int i = 2; i <= num; i++ )
        {
            accumulator = accumulator.multiply(BigInteger.valueOf(i));
        }

        return accumulator;
    }

    public static List<Integer> properDivisors(int num)
    {
        List<Integer> results = new ArrayList<Integer>();
        int maxBoundary = Math.max(1, num/2);

        for ( int i = 1; i <= maxBoundary; i++ )
        {
            if ( num % i == 0 )
            {
                results.add(i);
            }
        }

        return results;
    }

    public static long sum(List<Integer> list)
    {
        long accumulator = 0;

        for ( Integer integer : list )
        {
            accumulator += integer;
        }

        return accumulator;
    }

    public static boolean isPandigital(String digits, int numDigits)
    {
        if ( digits.length() > numDigits )
        {
            return false;
        }
        
        boolean[] hits = new boolean[numDigits + 1];
        hits[0] = true;

        for ( int i = 0; i < digits.length(); i++ )
        {
            String s = digits.substring(i, i+1);
            int digit = new Integer(s);
            try
            {
                hits[digit] = true;
            }
            catch ( ArrayIndexOutOfBoundsException e )
            {
                // We don't care.
            }
        }

        boolean allHits = true;
        for ( boolean b : hits )
        {
            if ( !b )
                allHits = false;
        }

        return allHits;
    }
}
