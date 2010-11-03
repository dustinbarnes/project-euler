package net.projecteuler.dustinbarnes;

public abstract class ProjectEulerSolution
{
    private boolean loggingEnabled = false;

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
}
