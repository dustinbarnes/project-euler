package net.projecteuler.dustinbarnes;

import java.util.HashSet;
import java.util.Set;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;


/**
 * http://projecteuler.net/index.php?section=problems&id=32
 *
 * Find the sum of all products whose multiplicand/multiplier/product
 * identity can be written as a 1 through 9 pandigital.
 */
public class Problem32
{
    private static final int MIN_MULTIPLIER = 1;
    private static final int MAX_MULTIPLIER = 9876;

    private Set<Integer> products;

    public long solve()
    {
        long accumulator = 0;

        products = new HashSet<Integer>();
        iterateSolutions();
        for ( Integer product : products )
        {
            accumulator += product;
        }

        return accumulator;
    }

    private void iterateSolutions()
    {
        for ( int multiplier = MIN_MULTIPLIER; multiplier <= MAX_MULTIPLIER; multiplier++ )
        {
            for ( int multiplicand = MAX_MULTIPLIER; multiplicand >= MIN_MULTIPLIER; multiplicand-- )
            {
                int product = multiplier * multiplicand;

                if ( isPandigital(multiplier, multiplicand, product) )
                {
                    System.out.println(multiplier + " * " + multiplicand + " = " + product);
                    products.add(product);
                }
            }
        }
    }

    boolean isPandigital(int multiplier, int multiplicand, int product)
    {
        String digits = "" + multiplier + "" + multiplicand + "" + product;
        return EulerProjectMath.isPandigital(digits, 9);
    }
}
