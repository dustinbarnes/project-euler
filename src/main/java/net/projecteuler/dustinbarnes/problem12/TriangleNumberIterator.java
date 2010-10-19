package net.projecteuler.dustinbarnes.problem12;

import java.util.Iterator;


public class TriangleNumberIterator implements Iterator<Integer>
{
    public int iterationNumber = 0;
    public int accumulator = 0;

    public boolean hasNext()
    {
        return true;
    }

    public Integer next()
    {
        iterationNumber++;
        accumulator += iterationNumber;
        return accumulator;
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
