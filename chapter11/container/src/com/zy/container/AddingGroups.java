package com.zy.container;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args)
    {
        Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        c.addAll(Arrays.asList(moreInts));
        Collections.addAll(c, 11, 12, 13, 15);
        Collections.addAll(c, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        list.add(21);
    }
}
