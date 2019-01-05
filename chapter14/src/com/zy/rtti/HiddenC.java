package com.zy.rtti;

class CC implements AA {
    public void f() {System.out.println("public CC.f()");}
    public void g() {System.out.println("public CC.g()");}
    void u() {System.out.println("package CC.u()");}
    protected void v() {System.out.println("protected CC.v()");}
    private void w() {System.out.println("private CC.w()");}
}

public class HiddenC {
    public static AA makeAA() {
        return new CC();
    }
}
