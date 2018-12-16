package com.zy.sprinklerSystem;

//composition for code reuse

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource constructor");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }
}

public class SprinklerSystem {
    private String s1, s2, s3, s4;
    {
        s1 = "s1";
        s2 = "s2";
        s3 = "s3";
        s4 = "s4";
    }
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return "s1 = " + s1 + "," +
                "s2 = " + s2 + "," +
                "s3 = " + s3 + "," +
                "s4 = " + s4 + "\n" +
                "i = " + i + "," +
                "f = " + f + "\n" +
                "source = " + source;
    }

    public static void main(String[] args){
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
