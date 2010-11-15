package net.projecteuler.dustinbarnes.problem31;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public enum BritishCoin
{
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    POUND(100),
    TWOPOUND(200);

    private int valueInPence;

    BritishCoin(int valueInPence)
    {
        this.valueInPence = valueInPence;
    }

    public int getValueInPence()
    {
        return valueInPence;
    }

    public static List<BritishCoin> orderedByValueDescending()
    {
        List<BritishCoin> coins = Arrays.asList(BritishCoin.values());
        Collections.sort(coins, new Comparator<BritishCoin>() {
            public int compare(BritishCoin first, BritishCoin second)
            {
                return second.getValueInPence() - first.getValueInPence();
            }
        });

        return coins;
    }
}
