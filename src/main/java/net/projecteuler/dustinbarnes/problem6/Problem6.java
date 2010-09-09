package net.projecteuler.dustinbarnes.problem6;

/**
 * http://projecteuler.net/index.php?section=problems&id=6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^(2) + 2^(2) + ... + 10^(2) = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^(2) = 55^(2) = 3025
 *
 * Hence the difference between the sum of the squares of the first
 * ten natural numbers and the square of the sum is 3025 ? 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one
 * hundred natural numbers and the square of the sum.
 */
public class Problem6
{
    public long getDifferenceBruteForce(int number)
    {
        return Math.abs(calculateSquareOfSumsBruteForce(number) - calculateSumOfSquaresBruteForce(number));
    }

    public long getDifferenceSmart(int num)
    {
        // euler: n(n+1)/2
        long sumOfNums = ((num * (num + 1))/2);
        long squareOfSums = sumOfNums * sumOfNums;

        // square pyramidal
        long sumOfSquares = num * (num + 1) * ((2 * num) + 1) / 6;
        
        return Math.abs(sumOfSquares - squareOfSums);
    }

    private long calculateSumOfSquaresBruteForce(int num)
    {
        long accumulator = 0;

        for ( int i = 0; i <= num; i++ )
        {
            accumulator += (i * i);
        }

        return accumulator;
    }

    private long calculateSquareOfSumsBruteForce(int num)
    {
        long accumulator = 0;

        for ( int i = 0; i <= num; i++ )
        {
            accumulator += i;
        }

        return accumulator*accumulator;
    }
}
