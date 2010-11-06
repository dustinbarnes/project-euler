package net.projecteuler.dustinbarnes;

import org.apache.commons.lang.StringUtils;


public abstract class ProjectEulerSolution
{
    private StringBuilder partialLog = new StringBuilder();

    public void log(Object... messages)
    {
        System.out.println(StringUtils.join(messages, " "));
    }

    public void partialLog(Object... messages)
    {
        for ( Object message : messages )
        {
            partialLog.append(message).append(" ");
        }
    }

    public void flushPartialLog()
    {
        System.out.println(partialLog.toString());
        partialLog = new StringBuilder();
    }
}
