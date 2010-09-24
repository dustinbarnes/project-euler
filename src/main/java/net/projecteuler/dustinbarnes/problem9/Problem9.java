package net.projecteuler.dustinbarnes.problem9;

/**
 * http://projecteuler.net/index.php?section=problems&id=9
 * <p/>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p/>
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p/>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9
{
    public int findTriplet()
    {
        int answer = 0;

        // These loop conditions are admittedly naive
        for ( int c = 1000*200; answer == 0 && c >= 1; c-- )
        {
            for ( int b = c - 1; answer == 0 && isSquare(c) && b >= 1; b-- )
            {
                for ( int a = b - 1; answer == 0 && isSquare(b) && a >= 1; a-- )
                {
                    if ( isTooLowAndShouldStopDecrementing(a, b, c) )
                    {
                        a = 0;
                    }
                    else if ( isSquare(a) && isMyPythagoreanTriplet(a, b, c) )
                    {
                        answer = getAnswer(a, b, c);
                    }
                }
            }
        }


        return answer;
    }

    private int getAnswer(int a, int b, int c)
    {
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double sqrtC = Math.sqrt(c);
        return (int) (sqrtA * sqrtB * sqrtC);
    }

    public boolean isTooLowAndShouldStopDecrementing(int a, int b, int c)
    {
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        double sqrtC = Math.sqrt(c);
        return (sqrtA + sqrtB + sqrtC) < 1000;
    }

    public boolean isMyPythagoreanTriplet(int a, int b, int c)
    {
        boolean isMyTriplet = ((a + b) == c);
        if ( isMyTriplet )
        {
            System.out.println("Triplet: " + a + "+" + b + "=" + c);
            int sqrtA = (int)Math.sqrt(a);
            int sqrtB = (int)Math.sqrt(b);
            int sqrtC = (int)Math.sqrt(c);
            int sumOfSquareRoots = sqrtA + sqrtB + sqrtC;
            System.out.println("Triplet: " + sqrtA + "+" + sqrtB + "+" + sqrtC + "=" + sumOfSquareRoots);
            isMyTriplet = (sumOfSquareRoots == 1000);
        }
        return isMyTriplet;
    }

    public boolean isSquare(int num)
    {
        double sqrt = Math.floor(Math.sqrt(num));
        return (sqrt * sqrt == num);
    }
}
