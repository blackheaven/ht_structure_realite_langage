class Statistics<T extends *able<T>>
{
    private T maximum;
    private T minimum;
    private T accumulator;
    private Integer cardinal;

    public Statistics(T v)
    {
        maximum = v;
        minimum = v;
        accumulator = v;
        cardinal = 1;
    }

    public T average()
    {
        return accumulator / cardinal;
    }

    public void merge(Statistics<T> v)
    {
        if (v.maximum > maximum)
            maximum = v.maximum;

        if (v.minimum < minimum)
            minimum = v.minimum;

        accumulator += v.accumulator;
        cardinal += v.cardinal;
    }

    // ------
    public String toString()
    {
        return maximum + " / " + average() + " / " + minimum + " / " + accumulator + " / " + cardinal;
    }

    public static void main(String[] args)
    {
        Statistics<Integer> i = new Statistics<Integer>(1);
        System.out.println(i);
        i.merge(new Statistics<Integer>(3));
        System.out.println(i);
    }
}
