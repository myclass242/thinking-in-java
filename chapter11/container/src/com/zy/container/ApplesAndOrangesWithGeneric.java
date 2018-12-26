package com.zy.container;

import java.util.*;

class Apple{
    private static long counter;
    private final long id = counter++;
    public long id()
    {
        return id;
    }
}
class Oranges{}

public class ApplesAndOrangesWithGeneric {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        ArrayList<Apple> apple = new ArrayList<Apple>();
        for (int i = 0; i < 3; ++i){
            apple.add(new Apple());
        }
//        apple.add(new Orange());
        for (int i = 0; i < apple.size(); ++i){
            System.out.println(apple.get(i).id());
        }
    }
}
