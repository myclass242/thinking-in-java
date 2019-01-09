package com.zy.generic;

abstract class GenericWithCreate<T> {
    T x;
    abstract T create();
    GenericWithCreate() {x = create();}
}

class X {}

class Creator extends GenericWithCreate<X> {
    X create() {
        return new X();
    }
    void f() {
        System.out.println(x.getClass().getSimpleName());
    }
}
public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
