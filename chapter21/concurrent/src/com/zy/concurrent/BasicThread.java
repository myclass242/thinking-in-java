package com.zy.concurrent;

public class BasicThread {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new LiftOff());
        t.start();
//        t.join();
        System.out.println("Waiting for liftoff");
    }
}
