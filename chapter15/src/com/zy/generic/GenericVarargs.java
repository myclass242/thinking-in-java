package com.zy.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    public static  <T> List<T> makeList(T... args) {
        List<T> l = new ArrayList<>();
        for (T t : args) {
            l.add(t);
        }
        return l;
    }
    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("a", "b", "C");
        System.out.println(ls);
    }
}
