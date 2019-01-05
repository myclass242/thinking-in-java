package com.zy.rtti;

public class Exercise10 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        System.out.println("superclass of char[] chars is" +
                chars.getClass().getSuperclass());
        if (chars instanceof Object) {
            System.out.println("char[] chars is instacnceof Object");
        }
    }
}
