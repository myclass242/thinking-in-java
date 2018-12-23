package com.zy.innerClass;

interface Contents {
    int value();
}

public class Parcel7 {
    public Contents content(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
    public static void main(String[] args)
    {
        Parcel7 p7 = new Parcel7();
        Contents cs = p7.content();
    }
}
