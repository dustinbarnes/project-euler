package net.projecteuler.dustinbarnes;

import net.projecteuler.dustinbarnes.problem31.Problem31;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=31
 *
 * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * How many different ways can £2 be made using any number of coins?
 */
public class Problem31Test
{
    @Test
    public void testSolve() throws Exception
    {
        Problem31 problem31 = new Problem31();
        assertThat(problem31.solve(), equalTo(73682));
    }
}
