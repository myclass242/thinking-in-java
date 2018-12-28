package com.zy.exceptionHandler;

class SimpleException extends Exception {}

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("f() throw SimpleException");

        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions ie = new InheritingExceptions();

        try {
            ie.f();
        } catch (SimpleException e) {
            System.out.println("Handle SimpleException");
        }
    }
}
