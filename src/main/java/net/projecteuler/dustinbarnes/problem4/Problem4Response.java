package net.projecteuler.dustinbarnes.problem4;

public class Problem4Response
{
    private int value;
    private int factor1;
    private int factor2;

    public Problem4Response(int value, int factor1, int factor2)
    {
        this.value = value;
        this.factor1 = factor1;
        this.factor2 = factor2;
    }

    public int getValue()
    {
        return value;
    }

    public int getFactor1()
    {
        return factor1;
    }

    public int getFactor2()
    {
        return factor2;
    }

    @Override
    public boolean equals(Object o)
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        Problem4Response that = (Problem4Response) o;

        return factor1 == that.factor1 && factor2 == that.factor2 && value == that.value;
    }

    @Override
    public String toString()
    {
        return "Problem4Response{" +
                "value=" + value +
                ", factor1=" + factor1 +
                ", factor2=" + factor2 +
                '}';
    }
}
