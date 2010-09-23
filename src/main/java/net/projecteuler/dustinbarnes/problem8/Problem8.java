package net.projecteuler.dustinbarnes.problem8;

/**
 * http://projecteuler.net/index.php?section=problems&id=8
 */
public class Problem8
{
    public int maximumSubsequence(String digits, int numDigitsToConsider)
    {
        int largest = 0;

        for ( int i = 0; i < digits.length() - numDigitsToConsider; i++ )
        {
            int subsequence = getSubsequence(digits.substring(i, i + numDigitsToConsider));
            if ( subsequence > largest )
            {
                largest = subsequence;
            }
        }

        return largest;
    }

    private int getSubsequence(String s)
    {
        int accumulator = 1;
        for ( int i = 0; i < s.length(); i++ )
        {
            String digit = s.substring(i, i + 1);
            accumulator *= Integer.parseInt(digit);
        }
        return accumulator;
    }
}
