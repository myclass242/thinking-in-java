package com.zy.rtti;

import java.lang.reflect.*;

interface Interface {
    void doSomething();
    void somethingElse(String arg);
}
class RealObject implements Interface {
    public void doSomething() {
        System.out.println("Realobject.doSomething()");
    }
    public void somethingElse(String arg) {
        System.out.println("Realobject.somethingElse(String arg)");
    }
}
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object obj) {
        proxied = obj;
    }
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + obj.getClass() + ",method: " + method + ",args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("Bonobo");
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        //Insert a proxy and call again
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class<?>[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
