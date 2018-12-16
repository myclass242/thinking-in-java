package com.zy.inheritance;

public class Ecercise2 extends Detergent {
    public void scrub(){
        append(" Exercise2.scrub()");
        super.scrub();
    }
    public void strilize(){
        append(" sterilize()");
    }
    public static void main(String[] args){
        Ecercise2 e2 = new Ecercise2();
        e2.dilute();
        e2.apply();
        e2.scrub();
        e2.strilize();
        System.out.println(e2);
//        super
    }
}
