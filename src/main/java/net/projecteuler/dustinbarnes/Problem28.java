package net.projecteuler.dustinbarnes;

/**
 * http://projecteuler.net/index.php?section=problems&id=27
 *
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
public class Problem28
{
    public int sumOfDiagonalsInSpiral(int spiralSize)
    {
        // Based on the problem, it seems we just take 1, then every other number for 4 numbers, then ever 4th, etc
        // Since we're on the corners, it's just previous line size + 2. And because we know the spiral size,
        // we have an ending condition. No need to create and walk a graph, it's just fancy counting.

        // Let's just count 1
        int sum = 1;

        int index = 1;
        int stepSize = 2;
        int cornerCount = 0;
        int endCondition = spiralSize * spiralSize;

        while ( index < endCondition )
        {
            index += stepSize;
            sum += index;
            cornerCount++;

            if ( cornerCount == 4 )
            {
                cornerCount = 0;
                stepSize += 2;
            }
        }

        return sum;
    }
}
