package net.projecteuler.dustinbarnes;

import java.math.BigInteger;

import net.projecteuler.dustinbarnes.utils.FibonacciIterator;


/**
 * http://projecteuler.net/index.php?section=problems&id=25
 *
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25 extends ProjectEulerSolution
{
    private static final int NUMBER_OF_DIGITS = 1000;

    public int solve()
    {
        int position = 0;
        FibonacciIterator iterator = new FibonacciIterator();
        while ( iterator.hasNext() )
        {
            position++;
            BigInteger fibonacci = iterator.next();
            if ( fibonacci.toString().length() >= NUMBER_OF_DIGITS )
            {
                break;
            }
        }
        return position;
    }
}
