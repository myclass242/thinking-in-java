package com.zy.Interface;

abstract class Base{
    Base()
    {
        print();
    }
    abstract void print();
//    {
//        System.out.println("abstruct Base.print()");
//    }
}

public class Exercise3 extends Base{
    private int i = 3;
    void print()
    {
        System.out.println("Exercise.print(), i = " + i);
    }
    public static void main(String[] args)
    {
        Exercise3 e3 = new Exercise3();
        e3.print();
    }
}
