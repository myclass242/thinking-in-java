package com.zy.exceptionHandler;

public class Exercise5 {
    public static void main(String[] args) {
        int[] a = new int[2];
        int idx = 5;
        while (true) {
            try {
                a[idx] = idx;
                System.out.println(a[idx]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                --idx;
            } finally {
                System.out.println("finally block");
            }
        }
    }
}
