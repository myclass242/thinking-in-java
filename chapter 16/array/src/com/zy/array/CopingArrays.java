package com.zy.array;

import java.util.*;

public class CopingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(i, 99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i, 0, j, 0, i.length);
        System.out.println("j = " + Arrays.toString(j));
        System.out.println(i.equals(j) == Arrays.equals(i, j));

        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u, new Integer(47));
        System.out.println("u = " + Arrays.toString(u));
        Arrays.fill(v, 99);
        System.out.println("v = " + Arrays.toString(v));
        Integer[] k = new Integer[10];
        System.arraycopy(u, 0, k, 0, u.length);
        Arrays.fill(k, 33);
        System.out.println("u = " + Arrays.toString(u));
        System.out.println("k = " + Arrays.toString(k));
    }
}
