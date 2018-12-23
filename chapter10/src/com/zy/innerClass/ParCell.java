package com.zy.innerClass;

public class ParCell {
    class Contents {
        private int i = 11;
        public int value() {return i;}
    }
    class Destination {
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel() {return label;}
    }
    //using inner class just like using other class, within ParCell
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        ParCell p = new ParCell();
        p.ship("ShangHai");
    }
}
