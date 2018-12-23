package com.zy.innerClass;

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private int pos = 0;
    private Object[] items;
    Sequence(int size)
    {
        items = new Object[size];
    }
    public void add(Object x)
    {
        items[pos++] = x;
    }
    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end()
        {
            return i == items.length;
        }
        public Object current()
        {
            return items[i];
        }
        public void next()
        {
            if (i < items.length)
            {
                ++i;
            }
        }
        public Sequence outter()
        {
            return Sequence.this;
        }
    }
    public Selector selector()
    {
        return new SequenceSelector();
    }
    private class SequenceReverseSelector implements Selector{
        private int i = items.length;
        public boolean end()
        {
            return i == items.length;
        }
        public boolean begin()
        {
            return i == 0;
        }
        public Object current()
        {
            return items[i];
        }
        public void next()
        {
            --i;
        }
        public Sequence outter()
        {
            return Sequence.this;
        }
    }
    public Selector reverseSelector()
    {
        return new SequenceReverseSelector();
    }
    public static void main(String[] args)
    {
        Sequence sequeue = new Sequence(13);
        for (int i = 0; i < 10; ++i)
        {
            sequeue.add(Integer.toString(i));
        }
        Sequence.SequenceSelector sss = sequeue.new SequenceSelector();
        assert (sequeue == sss.outter());
        sequeue.add(new Exercise2("one"));
        sequeue.add(new Exercise2("two"));
        sequeue.add(new Exercise2(("three")));
        Selector selector = sequeue.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}

class Exercise2{
    private String str;
    Exercise2(String str)
    {
        this.str = str;
    }
    public String toString()
    {
        return str;
    }
}