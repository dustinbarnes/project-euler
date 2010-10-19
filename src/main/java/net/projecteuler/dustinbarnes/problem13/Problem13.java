package net.projecteuler.dustinbarnes.problem13;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import net.projecteuler.dustinbarnes.utils.FileReader;


/**
 * http://projecteuler.net/index.php?section=problems&id=13
 */
public class Problem13
{
    private static List<BigInteger> numbers = new ArrayList<BigInteger>(100);

    public Problem13() throws IOException
    {
        for ( String str : FileReader.getLinesFromFile("problem-13-numbers.txt") )
        {
            numbers.add(new BigInteger(str));
        }
    }

    public String getFirstTenDigits()
    {
        BigInteger result = new BigInteger("0");

        for ( BigInteger number : numbers )
        {
            result = result.add(number);
        }

        return result.toString().substring(0, 10);
    }
}
