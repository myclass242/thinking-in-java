package com.zy.itfc;

import com.zy.Interface.*;

public class Exercise5 implements Instrument {
    public void play(int n){
        System.out.println("Exercise5.play(int)");
    }
    public void adjust(){
        System.out.println("Exercise5.adjust()");
    }

    public static void main(String[] args){
        Exercise5 e5 = new Exercise5();
        e5.play(3);
        e5.adjust();
    }
}
