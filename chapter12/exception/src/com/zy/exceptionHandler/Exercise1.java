package com.zy.exceptionHandler;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            String s = null;
            s.toCharArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("always executed");
        }
    }
}
