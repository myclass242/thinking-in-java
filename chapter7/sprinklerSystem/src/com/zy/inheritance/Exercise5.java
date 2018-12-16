package com.zy.inheritance;

class A{
    A(int i){
        System.out.println("A()");
    }
}
class B{
    B(int i){
        System.out.println("B()");
    }
}
class C extends A{
    B b;
    C(){
        super(47);
        b = new B(47);
    }
}

public class Exercise5 {
    public static void main(String[] args){
        C c = new C();
    }
}
