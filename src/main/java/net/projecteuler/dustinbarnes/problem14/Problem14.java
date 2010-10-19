package net.projecteuler.dustinbarnes.problem14;

import java.util.BitSet;
import java.util.List;

import net.projecteuler.dustinbarnes.primes.EulersSieve;


/**
 * http://projecteuler.net/index.php?section=problems&id=14
 *
 * Which starting number, under one million, produces the longest chain?
 */
public class Problem14
{
    int largestSoFar = 0;
    int maxNumberOfLinks = 0;
    private final int MAX_VALUE = 1000000;

    public int findLongestChain()
    {
        List<Integer> numbers = generateNumbersToCheck();
        for ( int i = 113383; i <= MAX_VALUE; i++ )
        {
            int numLinks = findNumberOfLinks(i);
            if ( numLinks > maxNumberOfLinks )
            {
                System.out.println(i + " has " + numLinks);
                maxNumberOfLinks = numLinks;
                largestSoFar = i;
            }
            if ( i % 10000 == 0 )
                System.out.println(i);
        }

        return largestSoFar;
    }

    private List<Integer> generateNumbersToCheck()
    {
        // We need to check 1 to 1 million.
        BitSet bitSet = new BitSet(MAX_VALUE);
        bitSet.set(0, bitSet.size()-1, true);

        // We can remove powers of 2, since they'll just divide out too quickly.
        for ( int i = 2; i < MAX_VALUE; i *= 2 )
        {
            bitSet.set(i-1, false);
        }

        // Cheating
        return EulersSieve.translateBitSetToList(bitSet);
    }

    private int findNumberOfLinks(int i)
    {
        long step = i;
        int count = 0;

        while ( step != 1 )
        {
            count++;
            step = transformStep(step);
        }

        return count;
    }

    private long transformStep(long step)
    {
        if ( step % 2 == 0 )
        {
            return step / 2;
        }
        else
        {
            return ((3 * step) + 1);
        }
    }
}
