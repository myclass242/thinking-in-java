package com.zy.container;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args)
    {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < 5; ++i){
            s.add(i);
        }
        for (Integer i : s){
            System.out.println(i);
        }
    }
}
