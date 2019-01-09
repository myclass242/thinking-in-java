package com.zy.generic;

public class GenericMethods {
    public <T> void print(T x) {
        System.out.println(x.getClass().getSimpleName());
    }
    public <T, U, V> void f(T t, U u, V v) {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(u.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.print("");
        gm.print(1);
        gm.print(1.0);
        gm.print(1.0f);
        gm.print('c');
        gm.print(gm);

        gm.f("", 1, gm);
        gm.f(1, "", gm);
    }
}
