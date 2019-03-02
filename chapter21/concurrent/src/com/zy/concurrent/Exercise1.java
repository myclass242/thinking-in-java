package com.zy.concurrent;

public class Exercise1 implements Runnable{
    private static int count = 0;
    private final int id = count++;
    public Exercise1() {
        System.out.println("Start<" + id + ">");
    }
    @Override
    public void run() {
        System.out.println("Run<" + id + ">");
        Thread.yield();
        System.out.println("Run<" + id + ">");
        Thread.yield();
        System.out.println("Run<" + id + ">");
        Thread.yield();
        System.out.println("<" + id + ">" + "completed");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            new Thread(new Exercise1()).start();
        }
    }
}
