package com.zy.generic;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> hs = new HashSet<>(a);
        hs.addAll(b);
        return hs;
    }
    public static <T> Set<T> intersetion(Set<T> a, Set<T> b) {
        Set<T> s = new HashSet<>(a);
        s.containsAll(b);
        return s;
    }
    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> s = new HashSet<>(a);
        s.removeAll(b);
        return s;
    }
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b) , intersetion(a, b));
    }
}
