package net.projecteuler.dustinbarnes.problem17;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=17
 *
 * If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were
 * written out in words, how many letters would be used?
 */
public class Problem17Test
{
    private Problem17 problem17 = new Problem17();
    @Test
    public void testGiven() throws Exception
    {
        assertThat(problem17.numberOfLetters(5), equalTo(19));
    }

    @Test
    public void testProblem() throws Exception
    {
        assertThat(problem17.numberOfLetters(1000), equalTo(21124));
    }
}
