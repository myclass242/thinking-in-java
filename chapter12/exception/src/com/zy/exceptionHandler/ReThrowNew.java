package com.zy.exceptionHandler;

class ExceptionOne extends Exception {
    ExceptionOne(String msg) {
        super(msg);
    }
}
class ExceptionTwo extends Exception {
    ExceptionTwo(String msg) {
        super(msg);
    }
}

public class ReThrowNew {
    public static void f() throws ExceptionOne {
        System.out.println("Originating the exception in f()");
        throw new ExceptionOne("throw from f()");
    }
    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (ExceptionOne e) {
                e.printStackTrace();
                e.getCause();
                throw new ExceptionTwo("throw from main try");
            }
        } catch (ExceptionTwo e) {
            e.printStackTrace();
        }
    }
}
