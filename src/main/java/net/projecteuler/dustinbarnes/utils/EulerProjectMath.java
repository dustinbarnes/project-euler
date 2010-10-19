package net.projecteuler.dustinbarnes.utils;

import java.math.BigInteger;


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
}
