package net.projecteuler.dustinbarnes.problem5;

/**
 * http://projecteuler.net/index.php?section=problems&id=5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5
{
    public int solveBruteForce(int upTo)
    {
        boolean found = false;
        int number = 0;

        while ( !found )
        {
            number++;
            found = check(number, upTo);
        }

        return number;
    }
    
    public boolean check(int number, int upTo)
    {
        boolean isValid = true;
        for ( int i = 1; i <= upTo; i++ )
        {
            int remainder = number % i;
            if ( remainder != 0 )
            {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
