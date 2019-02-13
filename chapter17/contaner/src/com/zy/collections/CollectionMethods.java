package com.zy.collections;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
//        c.addAll(Count)
        c.add("ten");
        c.add("eleven");
        System.out.println(c);

        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println("Max:" + Collections.max(c));
        System.out.println("Min:" + Collections.min(c));

        Collection<String> c2 = new ArrayList();
        c2.addAll(c);
        System.out.println(c2);
        c2.remove(0);
        System.out.println(c2);
        c2.remove("eleven");
        System.out.println(c2);
        c.removeAll(c2);
        c2.addAll(c);
        System.out.println(c2);
        System.out.println("c2 contains ten: " + c2.contains("ten"));
        System.out.println("c2 contains c: " + c2.containsAll(c));
        c.add("twel");
        c.add("forteen");
        c.add("fifteen");
        c.add("sixteen");
        Collection<String> c3 = ((ArrayList<String>) c).subList(3, 5);
        c2.addAll(c);
        System.out.println("c2 contains c3:" + c2.containsAll(c3));
        c2.retainAll(c3);
        System.out.println("c2 interact c3:" + c2);
        c2.removeAll(c3);
        System.out.println("c2 isEmpty:" + c2.isEmpty());
        c3.clear();
        System.out.println("c3 clear:" + c3);
    }
}
