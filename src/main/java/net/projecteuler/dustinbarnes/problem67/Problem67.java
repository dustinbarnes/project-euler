package net.projecteuler.dustinbarnes.problem67;

import java.util.List;

import net.projecteuler.dustinbarnes.problem18.Problem18;


/**
 * http://projecteuler.net/index.php?section=problems&id=67
 *
 * Created so early because of the similar nature of the problems. I am seeing if my
 * clever tricks for problem 18 come in handy here. In fact, I am just delegating
 * the work to that class.
 */
public class Problem67
{
    public int maximumPath(List<List<Integer>> definitions)
    {
        return new Problem18().maximumPath(definitions);
    }
}
