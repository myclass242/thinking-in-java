package com.zy.exceptionHandler;

class ExceptionA extends Exception {
    ExceptionA(String msg) {
        super(msg);
    }
}

class ExceptionB extends Exception {
    ExceptionB(String msg) {
        super(msg);
    }
}
class ExceptionC extends Exception {
    ExceptionC(String msg) {
        super(msg);
    }
}


public class Exercise9 {
    static void f(int i) throws ExceptionA, ExceptionB, ExceptionC {
        if (i < 0) {
            throw new ExceptionA("i < 0");
        } else if (i == 0) {
            throw new ExceptionB("i == 0");
        } else {
            throw new ExceptionC("i > 0");
        }
    }
    public static void main(String[] args) throws Exception{
        try {
            f(-1);
            f(0);
            f(1);
        } catch (Exception e) {
            e.printStackTrace();

            for (StackTraceElement em : e.getStackTrace()) {
                System.out.println(em);
            }

            throw e;
        }
//        } catch (ExceptionA e) {
//            e.printStackTrace();
//        } catch (ExceptionB e) {
//            e.printStackTrace();
//        } catch (ExceptionC e) {
//            e.printStackTrace();
//        }
    }
}
