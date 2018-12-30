package com.zy.string;

public class Imutable {
    public static void main(String[] args) {
        String q = "Hello World";
        System.out.println(q);
        String qq = q.toUpperCase();
        System.out.println(q);
        System.out.println(qq);
    }
}
