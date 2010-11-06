package net.projecteuler.dustinbarnes;

import java.math.BigInteger;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;


/**
 * http://projecteuler.net/index.php?section=problems&id=15
 *
 * How many routes are there through a 20x20 grid?
 */
public class Problem15 extends ProjectEulerSolution
{
    private long paths = 0;

    public long numberOfPaths(int gridSize)
    {
        // So the idea of permuting strings is good, but.. we're permuting! We have 40 slots to fill,
        // and 20 of them must be downs (or rights). So if you think of it as a set of
        // {move1, move2, move3, ...}, we need to pick 20 Downs. So the could be {move1, move2, move3}
        // or they could be {move1, move3} -- which means that move2 is a Right. So how many ways are there
        // to pick 20 items from a set of 40? Or, 40 choose 20?
        //
        // Our good friend the binomial coefficient will tell us! It's (n! / (n-k)!k!) where n is the set
        // size and k is the choose size. 
        BigInteger top = EulerProjectMath.factorial(gridSize * 2);
        BigInteger bottom = EulerProjectMath.factorial(gridSize).pow(2);
        BigInteger result = top.divide(bottom);

        return result.longValue();
    }

    public long numberOfPathsBruteForce(int gridSize)
    {
        // Instead of doing some graph search, we can visualize a solution as a series of Rs and Ds.
        // So we just have to create permutations that get us to the end of the graph.
        paths = 0;
        countPermutations("", gridSize, gridSize);

        return paths;
    }

    // This method brute forces a solution, and it's correct, but it's SLOW
    private void countPermutations(String solutionSoFar, int remainingPathDown, int remainingPathRight)
    {
        if ( remainingPathDown <= 0 && remainingPathRight <= 0 )
        {
            if ( paths % 100 == 0 )
                log(solutionSoFar);
                
            paths++;
        }
        else
        {
            if ( remainingPathDown > 0 )
            {
                countPermutations(solutionSoFar + "D", remainingPathDown-1, remainingPathRight);
            }

            if ( remainingPathRight > 0 )
            {
                countPermutations(solutionSoFar + "R", remainingPathDown, remainingPathRight-1);
            }
        }
    }
}
