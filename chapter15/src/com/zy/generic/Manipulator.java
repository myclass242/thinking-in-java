package com.zy.generic;

class HasF {
    void f() {
        System.out.println("HasF.f()");
    }
}

public class Manipulator<T extends HasF> {
    private T obj;
    public Manipulator(T x) {
        obj = x;
    }
    public void maniplate() {
        obj.f();
    }

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> m = new Manipulator<>(hf);
        m.maniplate();
    }
}
