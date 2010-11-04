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
}
