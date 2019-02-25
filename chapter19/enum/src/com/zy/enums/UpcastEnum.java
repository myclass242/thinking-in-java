package com.zy.enums;


enum Search {HH, YY}

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HH; //Upcast

        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}
