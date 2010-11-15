package net.projecteuler.dustinbarnes.problem31;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.projecteuler.dustinbarnes.ProjectEulerSolution;


/**
 * http://projecteuler.net/index.php?section=problems&id=31
 *
 * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * How many different ways can £2 be made using any number of coins?
 */
public class Problem31 extends ProjectEulerSolution
{
    public static final int MAX_PENCE = 200;
    public List<BritishCoin> coins;
    public int numSolutions;

    public int solve()
    {
        // This seems like a pretty standard permutation problem...
        numSolutions = 0;
        coins = BritishCoin.orderedByValueDescending();
        permuteCoins(new HashMap<BritishCoin, Integer>(), 0);
        return numSolutions;
    }

    public void permuteCoins(Map<BritishCoin, Integer> coinPurse, int coinPosition)
    {
        if ( isPurseExactlyFull(coinPurse) )
        {
            logSolution(coinPurse);
            return;
        }

        if ( isPurseTooFull(coinPurse) || coinPosition >= coins.size() )
        {
            return;
        }

        BritishCoin myCoin = coins.get(coinPosition);
        int maxCoins = (MAX_PENCE / myCoin.getValueInPence());
        for ( int i = maxCoins; i >= 0; i-- )
        {
            Map<BritishCoin, Integer> newPurse = new HashMap<BritishCoin, Integer>(coinPurse);
            newPurse.put(myCoin, i);
            permuteCoins(newPurse, coinPosition + 1);
        }
    }

    private void logSolution(Map<BritishCoin, Integer> coinPurse)
    {
        //log(coinPurse.toString());
        numSolutions++;
    }

    private boolean isPurseExactlyFull(Map<BritishCoin, Integer> coinPurse)
    {
         return calculateValue(coinPurse) == MAX_PENCE;
    }

    public boolean isPurseTooFull(Map<BritishCoin, Integer> coinPurse)
    {
        return calculateValue(coinPurse) > MAX_PENCE;
    }

    public int calculateValue(Map<BritishCoin, Integer> coinPurse)
    {
        int accumulator = 0;

        for ( BritishCoin britishCoin : coinPurse.keySet() )
        {
            accumulator += (coinPurse.get(britishCoin) * britishCoin.getValueInPence());
        }

        return accumulator;
    }
}
