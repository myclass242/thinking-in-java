package com.zy.container;

import java.util.*;

public class Statistics {
    public static void main(String[] args){
        Random rand = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000000; ++i){
            Integer r = rand.nextInt(100);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1: ++freq);
        }
        System.out.println(map);
    }
}
