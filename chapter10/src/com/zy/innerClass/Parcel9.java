package com.zy.innerClass;

public class Parcel9 {
    public Destination destination(String dest)
    {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args)
    {
        Parcel9 p9 = new Parcel9();
        Destination d = p9.destination("here");
        System.out.println(d.readLabel());
    }
}
