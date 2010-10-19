package net.projecteuler.dustinbarnes.problem18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * http://projecteuler.net/index.php?section=problems&id=18
 */
public class Problem18
{
    /*
     * In order to solve this cleverly, we are going to compute the "maximum" starting at the bottom.
     * Then, when we are in the row above and need to know the maximum subtree, we look at what we've already
     * computed, and work that way until we're at the first node. To make the algorithm more palatable,
     * however, we can just run a standard depth-first-search on the tree, and cache node results. So if we
     * visit (row, column), we can look in a cache to see if we have computed the maximum subsequence for that
     * position. If so, we just pick the maximum from there.
     */
    public Map<String, Integer> nodeCache = new HashMap<String, Integer>();

    // This is just so we can see what kind of speedup the cache provides
    int cacheHits = 0;

    public int maximumPath(List<List<Integer>> definitions)
    {
        return maxPath(definitions, 0, 0);
    }

    private int maxPath(List<List<Integer>> definitions, int row, int column)
    {
        String cacheKey = row + "|" + column;

        if ( row >= definitions.size() )
        {
            return 0;
        }

        if ( nodeCache.containsKey(cacheKey) )
        {
            cacheHits++;
            return nodeCache.get(cacheKey);
        }
        else
        {
            int me = definitions.get(row).get(column);
            int max = Math.max(maxPath(definitions, row+1, column+1), maxPath(definitions, row+1, column));
            nodeCache.put(cacheKey, me+max);
            return me+max;
        }
    }
}
