package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=15
 *
 * How many routes are there through a 20x20 grid?
 */
public class Problem15Test
{
    Problem15 problem15 = new Problem15();

    @Test
    public void testNumberOfPathsProblem() throws Exception
    {
        assertThat(problem15.numberOfPaths(20), equalTo(137846528820L));
    }

    @Test
    public void testNumberOfPathsGiven() throws Exception
    {
        assertThat(problem15.numberOfPaths(2), equalTo(6L));
    }
}
