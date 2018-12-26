package com.zy.container;

import java.util.*;

public class SetOfInteger {
    public static void main(String[] args)
    {
        Random rand = new Random(47);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 300000000; ++i){
            set.add(rand.nextInt(30));
        }

        System.out.println(set);
    }
}
