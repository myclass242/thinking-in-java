package com.zy.exceptionHandler;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block");
        }

    }
}
