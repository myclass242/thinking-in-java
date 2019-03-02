package com.zy.concurrent;

import java.util.concurrent.*;

public class ADeamon  implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Start daemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        } finally {
            System.out.println("This should always run?");
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ADeamon());
        t.setDaemon(true);
        t.start();
    }
}
