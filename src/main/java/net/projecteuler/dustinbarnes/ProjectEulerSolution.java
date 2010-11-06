package net.projecteuler.dustinbarnes;

import org.apache.commons.lang.StringUtils;


public abstract class ProjectEulerSolution
{
    private boolean loggingEnabled = false;
    private StringBuilder partialLog = new StringBuilder();

    public void setLoggingEnabled(boolean enabled)
    {
        loggingEnabled = enabled;
    }

    public void log(String message)
    {
        if ( loggingEnabled )
        {
            System.out.println(message);
        }
    }


    public void log(Object... messages)
    {
        if ( loggingEnabled )
        {
            System.out.println(StringUtils.join(messages, " "));
        }
    }

    public void partialLog(Object... messages)
    {
        if ( loggingEnabled )
        {
            for ( Object message : messages )
            {
                partialLog.append(message).append(" ");
            }
        }
    }

    public void flushPartialLog()
    {
        if ( loggingEnabled )
        {
            System.out.println(partialLog.toString());
            partialLog = new StringBuilder();
        }
    }
}
