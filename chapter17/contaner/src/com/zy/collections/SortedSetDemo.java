package com.zy.collections;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String hight = sortedSet.last();
        System.out.println(low);
        System.out.println(hight);
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; ++i) {
            if (i == 3) {
                low = it.next();
            }
            if (i == 6) {
                hight = it.next();
            } else {
                it.next();
            }
        }
        System.out.println(low);
        System.out.println(hight);
        System.out.println(sortedSet.subSet(low, hight));
        System.out.println(sortedSet.headSet(hight));
        System.out.println(sortedSet.tailSet(hight));
    }
}
