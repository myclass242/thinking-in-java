package com.zy.access;

import com.zy.rtti.*;
import java.lang.reflect.*;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception{
        AA a = HiddenC.makeAA();
        a.f();
        System.out.println(a.getClass().getName());

//        if (a instanceof CC) {
//            CC c = (CC)a;
//            c.g();
//        }

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method m = a.getClass().getDeclaredMethod(methodName);
        m.setAccessible(true);
        m.invoke(a);
    }
}
