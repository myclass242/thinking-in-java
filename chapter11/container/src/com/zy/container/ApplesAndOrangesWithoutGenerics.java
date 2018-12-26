package com.zy.container;

import java.util.*;

class Apples{
    private static long counter;
    private final long id = counter++;
    public long id()
    {
        return id;
    }
}
class Orange{}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ArrayList apple = new ArrayList();
        for (int i = 0; i < 3; ++i){
            apple.add(new Apples());
        }
        apple.add(new Orange());
        for (int i = 0; i < apple.size(); ++i){
            System.out.println(((Apples)apple.get(i)).id());
        }
    }
}
