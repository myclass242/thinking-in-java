package com.zy.delegation;

import com.zy.inheritance.Cleanser;

public class Detergent {
    private Cleanser c = new Cleanser();
    //change the method
    public void scrub(){
        c.append(" Detergent.scrub()");
        c.scrub();
    }
    //Add methods to interface
    public void foam(){
        c.append(" foam()");
    }
    //test the new class
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}
