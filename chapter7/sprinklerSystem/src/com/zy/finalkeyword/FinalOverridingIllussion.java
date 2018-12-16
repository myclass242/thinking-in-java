package com.zy.finalkeyword;

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
    public final void foo(){
        System.out.println("foo()");
    }
}
class OverridingPrivate extends WithFinals{
     private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
//    @Override public void foo(){
//
//    }
}
class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
public class FinalOverridingIllussion {
    public static void main(String[] args){
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //can upcast
        OverridingPrivate op1 = op2;
//        op1.f();
//        op1.g();
        WithFinals wf = op2;
    }
}
