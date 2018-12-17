package com.zy.polymorphic;

class Base{
    void fa(){
        System.out.println("Base.fa()");
        fb();
    }
    void fb(){
        System.out.println("Base.fb()");
    }
}

public class Exercise10 extends Base{
    @Override void fb(){
        System.out.println("Exercise10.fb()");
    }
    public static void main(String[] args){
        Base b = new Exercise10();
        b.fa();
    }
}
