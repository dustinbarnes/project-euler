package net.projecteuler.dustinbarnes.problem18;

import java.util.ArrayList;
import java.util.List;

import net.projecteuler.dustinbarnes.utils.FileReader;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * http://projecteuler.net/index.php?section=problems&id=18
 */
public class Problem18Test
{
    @Test
    public void testMaximumPath() throws Exception
    {
        List<List<Integer>> definitions = getDefinitions();
        assertThat(new Problem18().maximumPath(definitions), equalTo(1074));
    }

    private List<List<Integer>> getDefinitions()
    {
        List<List<Integer>> definitions = new ArrayList<List<Integer>>();
        List<String> base = FileReader.getLinesFromFile("problem-18-triangle.txt");

        for ( String line : base )
        {
            List<Integer> properNumbers = new ArrayList<Integer>();
            for ( String num : line.split(" ") )
            {
                properNumbers.add(Integer.parseInt(num));
            }
            definitions.add(properNumbers);
        }

        return definitions;
    }
}
