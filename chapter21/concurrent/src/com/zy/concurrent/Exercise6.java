package com.zy.concurrent;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.*;

public class Exercise6 implements Runnable{
    private static Random rand = new Random(47);
    @Override
    public void run() {
        try {
            int sleepTime = rand.nextInt(9) + 1;
            long start = System.currentTimeMillis();
            TimeUnit.SECONDS.sleep(sleepTime);
            long end = System.currentTimeMillis();
            System.out.println("Sleeped<" + sleepTime + "> " + (end - start) / 1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; ++i) {
            exec.execute(new Exercise6());
        }
        exec.shutdown();
    }
}
