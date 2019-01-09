package com.zy.generic;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;
    public IterableFibonacci(int count) {n = count;}
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {return n > 0;}
            public Integer next() {
                --n;
                return IterableFibonacci.this.next();
            }
            public void remove() {
                //Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci fib = new IterableFibonacci(18);
        for (int i : fib) {
            System.out.println(i);
        }

        for (int i : new Exercise7(18)) {
            System.out.println(i);
        }
    }
}

class Exercise7 implements Iterable<Integer>{
    private Fibonacci fib = new Fibonacci();
    private int count;
    Exercise7(int cnt) {
        System.out.println("Constructor Exercise7()");
        count = cnt;
    }
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                --count;
                return count > 0;
            }
            public Integer next() {
                return fib.next();
            }
            public void remove() {
                //unImplement
                throw new UnsupportedOperationException();
            }
        };
    }
}
