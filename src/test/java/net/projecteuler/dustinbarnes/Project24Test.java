package net.projecteuler.dustinbarnes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=24
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class Project24Test
{
    private Project24 project24 = new Project24();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(project24.solve(), equalTo("2783915460"));
    }
}
