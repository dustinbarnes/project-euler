package net.projecteuler.dustinbarnes.problem4;

import org.apache.commons.lang.StringUtils;


public class Problem4
{
    public Problem4Response getLargestPalindrome(int numDigits)
    {
        Problem4Response largestPalindrome = new Problem4Response(0, 0, 0);

        // Because we count down, we can early return when we find a palindrome.
        for ( int i = largestForNumberOfDigits(numDigits); i > 0; i-- )
        {
            for ( int j = i; j > 0; j-- )
            {
                int result = i*j;

                // Short circuit in case we're never going to get higher than the current highest...
                if ( result < largestPalindrome.getValue() )
                {
                    j = 0;
                }
                else
                {
                    System.out.println(i + " x " + j + " = " + result);
                    if ( isPalindrome(result) )
                    {
                        System.out.println("largest!");
                        largestPalindrome = new Problem4Response(result, i, j);
                    }
                }
            }
        }

        // Nothing found??
        return largestPalindrome;
    }

    private int largestForNumberOfDigits(int numDigits)
    {
        String largest = StringUtils.repeat("9", numDigits);
        return Integer.parseInt(largest);
    }

    private boolean isPalindrome(int number)
    {
        String forwards = String.valueOf(number);
        String backwards = StringUtils.reverse(forwards);
        return forwards.equals(backwards);
    }
}
