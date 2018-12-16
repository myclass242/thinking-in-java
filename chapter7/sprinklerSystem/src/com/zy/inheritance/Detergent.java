package com.zy.inheritance;

public class Detergent extends Cleanser{
    //change the method
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    //Add methods to interface
    public void foam(){
        append(" foam()");
    }
    //test the new class
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}
