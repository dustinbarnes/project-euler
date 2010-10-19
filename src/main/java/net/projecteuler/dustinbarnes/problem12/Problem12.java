package net.projecteuler.dustinbarnes.problem12;

/**
 * http://projecteuler.net/index.php?section=problems&id=12
 *
 * The sequence of triangle numbers is generated by adding the
 * natural numbers. So the 7th triangle number would be
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem12
{
    public int triangleNumberWithDivisorCount(int numDivisors)
    {
        TriangleNumberIterator iterator = new TriangleNumberIterator();
        int answer = 0;
        int maxSoFar = 0;

        while ( iterator.hasNext() )
        {
            int triangle = iterator.next();
            if ( triangle < 0 )
            {
                throw new IndexOutOfBoundsException();
            }
            
            int divisors = numDivisors(triangle);

            if ( divisors > maxSoFar )
            {
                maxSoFar = divisors;
                System.out.println(triangle + " with " + divisors + " divisors");
            }

            if ( divisors >= numDivisors )
            {
                answer = triangle;
                break;
            }
        }

        return answer;
    }

    private int numDivisors(int triangle)
    {
        int max = (int)Math.ceil(triangle / 2);

        // Start at 1 for division by itself, then we only need to go up to num/2.
        int divisors = 1;

        for ( int i = max; i >= 1; i-- )
        {
            if ( triangle % i == 0 )
            {
                divisors++;
            }
        }

        return divisors;
    }
}