package com.zy.collections;

import java.util.*;

public class Exercise11 implements Comparable<Exercise11> {
    private Integer value;
    static private Random rand = new Random(47);
    Exercise11() { value = rand.nextInt(100); }
    public int compareTo(Exercise11 rhs) {
        if (value < rhs.value) {
            return -1;
        } else if (value > rhs.value) {
            return 1;
        } else {
            return 0;
        }
    }
    public String toString() {
        return Integer.toString(value);
    }
    public static void main(String[] args) {
        PriorityQueue<Exercise11> q11 = new PriorityQueue<>();
        for (int i = 0; i < 20; ++i) {
            q11.offer(new Exercise11());
        }
        while (q11.peek() != null) {
            System.out.print(q11.poll() + " ");
        }
    }
}
