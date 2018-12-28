package com.zy.exceptionHandler;

class ThrowException {
    void f() throws Exercise6Exception1{
        System.out.println("f()");
        throw new Exercise6Exception1();
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        ThrowException te = new ThrowException();
        try {
            te.f();
        } catch (Exercise6Exception1 e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }
}
