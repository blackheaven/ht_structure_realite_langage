class Statistics
{
    public Integer maximum;
    public Integer minimum;
    public Integer accumulator;
    public Integer cardinal;

    public Statistics()
    {
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;
        accumulator = 0;
        cardinal = 0;
    }

    public Integer average()
    {
        if (cardinal == 0)
            return 0;
        else
            return accumulator / cardinal;
    }

    public void addElement(Integer v)
    {
        if (v > maximum)
            maximum = v;

        if (v < minimum)
            minimum = v;

        accumulator += v;
        cardinal++;
    }

    // ------
    public String toString()
    {
        return maximum + " / " + average() + " / " + minimum + " / " + accumulator + " / " + cardinal;
    }

    public static void main(String[] args)
    {
        Statistics i = new Statistics();
        System.out.println(i);
        i.addElement(1);
        System.out.println(i);
        i.addElement(3);
        System.out.println(i);
    }
}
