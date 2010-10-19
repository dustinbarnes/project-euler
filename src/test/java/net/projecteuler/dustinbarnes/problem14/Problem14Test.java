package net.projecteuler.dustinbarnes.problem14;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=14
 *
 * Which starting number, under one million, produces the longest chain?
 */
public class Problem14Test
{
    @Test
    public void testFindLongestChain() throws Exception
    {
        assertThat(new Problem14().findLongestChain(), equalTo(837799));
    }
}
