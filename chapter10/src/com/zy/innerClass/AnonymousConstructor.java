package com.zy.innerClass;

abstract class Base{
    public Base(int x)
    {
        System.out.println("Base Constructor, i = " + x);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i)
    {
        return new Base(i){
            {System.out.println("Inside instance initializer");}    //通过实例初始化，为匿名内部类达到构造函数的效果
            public void f()
            {
                System.out.println("In anonymous f()");
            }
        };
    }
    public static void main(String[] args)
    {
        Base b = getBase(47);
        b.f();
    }
}
