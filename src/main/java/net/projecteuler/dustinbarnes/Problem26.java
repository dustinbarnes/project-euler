package net.projecteuler.dustinbarnes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


/**
 * http://projecteuler.net/index.php?section=problems&id=26
 *
 * Find the value of d < 1000 for which 1/d contains the longest
 * recurring cycle in its decimal fraction part.
 */
public class Problem26 extends ProjectEulerSolution
{
    public static final int MAX_DIVIDE_PRECISION = 2000;
    private static final int MAX = 1000;
    private static final Pattern REMOVE_ZEROES_PATTERN = Pattern.compile("0{4,}$");

    private int longestSoFarNumber = 0;
    private int longestSoFarLength = -1;

    // These numbers were chosen to tune the runtime of the searching algorithm for the future
    // If you want a true brute force run, set the start to 1998, and length to 999, but be
    // prepared for a 30+ minute runtime. 
    private static final int MAX_STARTING_POINT = 10;
    private static final int MAX_LENGTH_TO_CHECK = 999;

    public int solve()
    {
        for ( int i = 2; i < MAX; i++ )
        {
            String number = getSanitizedValue(i);

            String recurrence = getRecurrence(number);
            if ( recurrence.length() > longestSoFarLength )
            {
                longestSoFarNumber = i;
                longestSoFarLength = recurrence.length();
            }
        }

        return longestSoFarNumber;
    }

    public String getSanitizedValue(int divisor)
    {
        BigDecimal result = BigDecimal.ONE.divide(new BigDecimal(divisor), MAX_DIVIDE_PRECISION, RoundingMode.HALF_EVEN);

        String number = result.toString();

        // Get rid of the 0. and the last digit (which was probably rounded)
        number = number.substring(2, number.length() - 2);

        // And get rid of trailing zeroes
        Matcher matcher = REMOVE_ZEROES_PATTERN.matcher(number);
        number = matcher.replaceFirst("");

        return number;
    }

    public String getRecurrence(String number)
    {
        String recurrence = "";

        // If the length isn't (MAX_DIVIDE_PRECISION - 2) -- due to removing last
        // digit, then it's not a recurrence number, since it didn't fill the buffer
        if ( number.length() == (MAX_DIVIDE_PRECISION - 2) )
        {
            recurrence = findRecurrence(number);
            assert(recurrence.length() > 0);
        }

        return recurrence;
    }

    private String findRecurrence(String number)
    {
        // To find the shortest period, we need to go through based on length.
        for ( int length = 1; length < MAX_LENGTH_TO_CHECK; length++ )
        {
            for ( int startingPosition = 0; startingPosition < MAX_STARTING_POINT; startingPosition++ )
            {
                String base = StringUtils.substring(number, 0, startingPosition);

                int endingPosition = startingPosition + length;
                String recurrenceToCheck = StringUtils.substring(number, startingPosition, endingPosition);

                String filledWithRecurrenceGuess = fillToMatch(base, recurrenceToCheck);

                if ( number.equals(filledWithRecurrenceGuess) )
                {
                    return recurrenceToCheck;
                }
            }
        }

        return "";
    }

    private String fillToMatch(String base, String recurrence)
    {
        return StringUtils.rightPad(base, MAX_DIVIDE_PRECISION - 2, recurrence);
    }
}
