package net.projecteuler.dustinbarnes;

import net.projecteuler.dustinbarnes.utils.EulerProjectMath;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=32
 *
 * Find the sum of all products whose multiplicand/multiplier/product
 * identity can be written as a 1 through 9 pandigital.
 */
public class Problem32Test
{
    @Test
    public void testSolve() throws Exception
    {
        Problem32 problem32 = new Problem32();
        assertThat(problem32.solve(), equalTo(45228L));
    }

    @Test
    public void testPandigital()
    {
        assertThat(EulerProjectMath.isPandigital("12345", 5), equalTo(true));
        assertThat(EulerProjectMath.isPandigital("12345", 6), equalTo(false));
        assertThat(EulerProjectMath.isPandigital("123465", 6), equalTo(true));
        assertThat(EulerProjectMath.isPandigital("234651", 6), equalTo(true));
        assertThat(EulerProjectMath.isPandigital("2346651", 6), equalTo(false));
        assertThat(EulerProjectMath.isPandigital("23651", 5), equalTo(false));
    }
}
