package net.projecteuler.dustinbarnes.problem17;

import java.util.HashMap;
import java.util.Map;


/**
 * http://projecteuler.net/index.php?section=problems&id=17
 *
 * If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were
 * written out in words, how many letters would be used?
 *
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
 * contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of
 * "and" when writing out numbers is in compliance with British usage.
 */
public class Problem17
{
    private static final Map<Integer, String> specialCases = new HashMap<Integer, String>() {{
        put(1000, "onethousand");
        put(90, "ninety");
        put(80, "eighty");
        put(70, "seventy");
        put(60, "sixty");
        put(50, "fifty");
        put(40, "forty");
        put(30, "thirty");
        put(20, "twenty");
        put(19, "nineteen");
        put(18, "eighteen");
        put(17, "seventeen");
        put(16, "sixteen");
        put(15, "fifteen");
        put(14, "fourteen");
        put(13, "thirteen");
        put(12, "twelve");
        put(11, "eleven");
        put(10, "ten");
        put(9, "nine");
        put(8, "eight");
        put(7, "seven");
        put(6, "six");
        put(5, "five");
        put(4, "four");
        put(3, "three");
        put(2, "two");
        put(1, "one");
    }};

    public int numberOfLetters(int max)
    {
        int accumulator = 0;

        for ( int i = 1; i <= max; i++ )
        {
            accumulator += countLetters(i);
        }

        return accumulator;
    }

    private int countLetters(int number)
    {
        String result = getTextOf(number);
        return result.length();
    }

    private String getTextOf(int number)
    {
        if ( specialCases.containsKey(number) )
        {
            return specialCases.get(number);
        }
        else
        {
            if ( number % 100 == 0 )
            {
                int hundred = number / 100;
                return getTextOf(hundred) + "hundred";
            }
            else if ( number > 100 )
            {
                int hundred = (number / 100);
                int remainder = (number % 100);
                return getTextOf(hundred) + "hundredand" + getTextOf(remainder);
            }
            else
            {
                int tens = (number / 10) * 10;
                int ones = number % 10;
                return getTextOf(tens) + getTextOf(ones);
            }
        }
    }
}
