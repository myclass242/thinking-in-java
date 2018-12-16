package com.zy.overload;

class A{
    void f(){
        System.out.println("f()");
    }
    void f(int i){
        System.out.println("f{int}");
    }
    void f(float f){
        System.out.println("f(float)");
    }
}
class B extends A{
    void f(double d){
        System.out.println("f(double)");
    }
}

public class Exercise13 {
    public static void main(String[] args){
        B b = new B();
        b.f();
        b.f(1);
        b.f(1.0f);
        b.f((double)1.0);
    }
}
