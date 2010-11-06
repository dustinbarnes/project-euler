package net.projecteuler.dustinbarnes;

import java.util.Arrays;
import java.util.List;


/**
 * http://projecteuler.net/index.php?section=problems&id=24
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Problem24 extends ProjectEulerSolution
{
    private static final List<String> digits = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

    public int iterator;
    public String combination;

    public String solve()
    {
        setLoggingEnabled(true);

        this.iterator = 0;
        this.combination = "";

        solve("");
        return combination;
    }

    private boolean solve(String base)
    {
        if ( base.length() == digits.size() )
        {
            combination = base;
            iterator++;

            return iterator == 1000000;
        }
        else
        {
            for ( String digit : digits )
            {
                if ( !base.contains(digit) )
                {
                    if ( solve(base + digit) )
                    {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
