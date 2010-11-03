package net.projecteuler.dustinbarnes;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import net.projecteuler.dustinbarnes.utils.FileReader;


/**
 * http://projecteuler.net/index.php?section=problems&id=22
 *
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over
 * five-thousand first names, begin by sorting it into alphabetical order. Then working out the
 * alphabetical value for each name, multiply this value by its alphabetical position in the
 * list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 x 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
public class Problem22 extends ProjectEulerSolution
{
    public int baseCharOffset = 'A' - 1;

    public BigInteger solve()
    {
        setLoggingEnabled(true);
        
        List<String> names = FileReader.getLinesFromFile("problem-22-names.txt");
        Collections.sort(names);

        BigInteger accumulator = new BigInteger("0");

        for ( int i = 0; i < names.size(); i++ )
        {
            long result = (i+1) * alphaValue(names.get(i));
            accumulator = accumulator.add(new BigInteger("" + result));
        }

        return accumulator;
    }

    private long alphaValue(String name)
    {
        long accumulator = 0;

        for ( int i = 0; i < name.length(); i++ )
        {
            int value = name.charAt(i) - baseCharOffset;
            accumulator += value;
        }

        return accumulator;
    }
}
