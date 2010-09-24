package net.projecteuler.dustinbarnes.primes;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;


public final class EulersSieve
{
    private static final int FIRST_PRIME = 2;

    /* This is a utility class that should not be instantiated */
    private EulersSieve()
    {
    }

    public static List<Integer> generatePrimes(int maxValue)
    {
        if ( maxValue < 2 )
        {
            throw new IllegalArgumentException("primes under 2? surely, good sir...");
        }

        BitSet bitset = createInitialBitSet(maxValue);
        runSieve(bitset, maxValue);
        return translateBitSetToList(bitset);
    }

    private static BitSet createInitialBitSet(int maxValue)
    {
        BitSet bitset = new BitSet(maxValue);
        bitset.set(0, FIRST_PRIME-1, false);
        bitset.set(FIRST_PRIME, maxValue, true);
        return bitset;
    }

    private static void runSieve(BitSet bitset, int maxValue)
    {
        int squareRootOfMax = (int) Math.floor(Math.sqrt(maxValue));
        for ( int i = 0; i <= squareRootOfMax; i++ )
        {
            if ( isPrime(bitset, i) )
            {
                sieveMultiples(bitset, i);
            }
        }
    }

    private static void sieveMultiples(BitSet bitset, int number)
    {
        for ( int i = number * number; i <= bitset.size(); i += number )
        {
            bitset.set(i, false);
        }
    }

    private static boolean isPrime(BitSet bitset, int i)
    {
        return bitset.get(i);
    }

    private static List<Integer> translateBitSetToList(BitSet bitset)
    {
        List<Integer> primes = new ArrayList<Integer>();

        int lastPrime = FIRST_PRIME;

        while ( lastPrime != -1 ) 
        {
            primes.add(lastPrime);
            lastPrime = bitset.nextSetBit(lastPrime + 1);
        }
        
        return primes;
    }
}
