package com.zy.innerClass;

public class Exercise1 {
    class Inner{
        String show()
        {
            return "Inner.show()";
        }
    }
    public Inner getInner()
    {
        return new Inner();
    }
    public static void main(String[] args)
    {
        Exercise1 e1 = new Exercise1();
        Inner i = e1.getInner();
        System.out.println(i.show());
    }
}
