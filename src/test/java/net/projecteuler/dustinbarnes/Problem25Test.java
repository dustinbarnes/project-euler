package net.projecteuler.dustinbarnes;

import net.projecteuler.dustinbarnes.utils.FibonacciIterator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=25
 *
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Problem25Test
{
    private Problem25 problem25 = new Problem25();

    @Test
    public void testSolve() throws Exception
    {
        assertThat(problem25.solve(), equalTo(4782));    
    }

    @Test
    public void testFibonacciIterator()
    {
        int i = 0;
        FibonacciIterator iterator = new FibonacciIterator();
        while ( iterator.hasNext() && i <= 1000 )
        {
            i++;
            System.out.println(i + " = " + iterator.next().toString());
        }
    }
}
