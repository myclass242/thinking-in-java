package com.zy.container;

import java.util.*;

public class PrintContainers {
    static Collection fill(Collection<String> c)
    {
        c.add("rat");
        c.add("cat");
        c.add("dog");
        c.add("dog");
        return c;
    }
    static Map fill(Map<String, String> map)
    {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("Dog", "Spot");
        return map;
    }
    public static void main(String[] args)
    {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }
}
