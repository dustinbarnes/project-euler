package net.projecteuler.dustinbarnes.utils;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<BigInteger>
{
    private BigInteger firstNumber = new BigInteger("1");
    private BigInteger secondNumber = new BigInteger("1");

    private int fibonacciPosition = 0;

    public boolean hasNext()
    {
        return true;
    }

    public BigInteger next()
    {
        fibonacciPosition++;
        
        if ( fibonacciPosition == 1 || fibonacciPosition == 2 )
        {
            return firstNumber;
        }
        else
        {
            BigInteger next = firstNumber.add(secondNumber);
            firstNumber = secondNumber;
            secondNumber = next;
            return secondNumber;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Can't remove from fibonacci");
    }
}
