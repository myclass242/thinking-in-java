package com.zy.generic;

public class Holder<T> {
    private T a;
    public Holder(T v) {a = v;}
    public void set(T v) {a = v;}
    public T get() {return a;}

    public static void main(String[] args) {
        Holder<String> h3 = new Holder<>("Hello World");
        String a = h3.get();
        System.out.println(a);

//        h3.set(1);
    }
}
