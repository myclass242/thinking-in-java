package com.zy.collections;

import java.util.*;

public class CountingIntegerlist extends AbstractList<Integer> {
    private int size;
    public CountingIntegerlist(int size) {
        this.size = size < 0 ? 0 : size;
    }
    public int size() {
        return size;
    }
    public Integer get(int index) {
        return Integer.valueOf(index);
    }
    public static void main(String[] args) {
        System.out.println(new CountingIntegerlist(30));
    }
}
