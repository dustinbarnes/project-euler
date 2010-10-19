package net.projecteuler.dustinbarnes.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Util class to take care of some boring work
 */
public final class FileReader
{
    public static List<String> getLinesFromFile(String filename)
    {
        List<String> results = new ArrayList<String>();

        InputStream in = FileReader.class.getClassLoader().getResourceAsStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        try
        {
            while ( (strLine = br.readLine()) != null )
            {
                results.add(strLine);
            }
        }
        catch ( IOException e )
        {
            throw new RuntimeException(e);
        }

        return results;
    }
}
