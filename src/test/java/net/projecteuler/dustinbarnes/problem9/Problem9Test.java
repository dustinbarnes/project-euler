package net.projecteuler.dustinbarnes.problem9;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=9
 *
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9Test
{
    @Test
    public void testFindTriplet() throws Exception
    {
        assertThat(new Problem9().findTriplet(), equalTo(31875000));
    }
}
