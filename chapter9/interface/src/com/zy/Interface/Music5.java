package com.zy.Interface;

class Wind implements Instrument{
    public void play(int n){
        System.out.println(n);
    }
    public void adjust(){
        System.out.println("Wind.adjust()");
    }
    public String toString(){
        return "Wind";
    }
}
class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}
public class Music5 {
    public static void main(String[] args){
        Instrument[] orchestra = {new Wind(), new Brass()};
        for (Instrument orch : orchestra){
            System.out.println(orch.toString());
        }
    }
}
