package net.projecteuler.dustinbarnes.problem7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=7
 *
 * What is the 10001st prime number?
 *
 * NOTE: due to size of heap, run with additional memory (768m is sufficient)
 */
public class Problem7Test
{
    Problem7 problem7 = new Problem7();
    
    @Test
    public void testFindPrime() throws Exception
    {
        // Since we don't know what value of max is required to get 10001 primes,
        // we just *10 it until we get it :)
        int guess = 100000;
        boolean found = false;
        int number = 2;

        while ( !found )
        {
            try
            {
                number = problem7.findPrime(guess);
                found = true;
            }
            catch ( IndexOutOfBoundsException ex )
            {
                guess *= 10;   
            }
        }
        assertThat(number, equalTo(104743));
    }
}
