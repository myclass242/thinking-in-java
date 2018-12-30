package com.zy.string;

import java.util.*;

public class InfiniteRecursion {
    public String toString() {
        return "InfiniteRecursion address: "  + super.toString() + "\n";
//        return "InfiniteRecursion address: " + this + "\n"; 递归调用，调用this.toString()方法
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> al = new ArrayList<>();
        for (int i = 0; i < 25; ++i) {
            al.add(new InfiniteRecursion());
        }
        System.out.println(al);
    }
}
