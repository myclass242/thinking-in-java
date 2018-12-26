package com.zy.container;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

public class CollectionSequence extends AbstractCollection<Integer> {
    private Integer[] ints = new Integer[10];
    public int size() {return ints.length;};
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>() {
            private int idx = 0;
            public boolean hasNext()
            {
                return idx < ints.length;
            }
            public Integer next()
            {
                return ints[idx++];
            }
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args)
    {
        for (Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
