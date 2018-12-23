package com.zy.innerClass;

interface U{
    void f1();
    void f2();
    void f3();
}
class A{
    public U getU()
    {
        return new U(){
            public void f1()
            {
                System.out.println("A f1()");
            }
            public void f2()
            {
                System.out.println("A f2()");
            }
            public void f3()
            {
                System.out.println("A f3()");
            }
        };
    }
}
class B{
    private static final int ARRAY_SIZE = 10;
    private U[] items = new U[ARRAY_SIZE];
    private int pos = 0;
    public void addItem(U u)
    {
        if (pos < ARRAY_SIZE)
        {
            items[pos++] = u;
        }
        else
        {
            System.out.println("Array out of arrange");
        }
    }
    public void addItem(U u, int pos)
    {
        if (pos < ARRAY_SIZE)
        {
            items[pos++] = u;
        }
        else
        {
            System.out.println("Array out of arrange");
        }
    }
    public void arrayInit(int pos)
    {
        if (pos < ARRAY_SIZE)
        {
            items[pos++] = null;
        }
        else
        {
            System.out.println("Array out of arrange");
        }
    }
    public void arrayInit()
    {
        for (int i = 0; i < ARRAY_SIZE; ++i){
            items[i] = null;
        }
    }
    public void showUs()
    {
        for (U u : items){
            u.f1();
            u.f2();
            u.f3();
        }
    }
}
public class Exercise23 {
    public static void main(String[] args)
    {
        A[] as = new A[10];
        B b = new B();
        for (A a : as){
            a = new A();
            b.addItem(a.getU());
        }
        b.showUs();
    }
}
