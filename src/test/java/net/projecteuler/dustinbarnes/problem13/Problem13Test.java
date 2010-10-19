package net.projecteuler.dustinbarnes.problem13;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=13
 */
public class Problem13Test
{
    @Test
    public void testGetFirstTenDigits() throws Exception
    {
        assertThat(new Problem13().getFirstTenDigits(), equalTo("5537376230"));
    }
}
