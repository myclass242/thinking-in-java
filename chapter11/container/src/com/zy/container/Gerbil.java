package com.zy.container;

import java.util.*;

public class Gerbil {
    private int gerbilNumber;
    Gerbil(int number)
    {
        gerbilNumber = number;
    }
    public void hop()
    {
        System.out.println("Gerbil-" + gerbilNumber + ":jumping");
    }
    public static void main(String[] args)
    {
        ArrayList<Gerbil> al = new ArrayList<Gerbil>();
        for (int i = 0; i < 5; ++i)
        {
            al.add(new Gerbil(i));
        }
        for (int i = 0; i < al.size(); ++i){
            al.get(i).hop();
        }

        Collection<Integer> cont = new ArrayList<Integer>();
        for (int i = 0; i < 3; ++i)
        {
            cont.add(i);
        }
        for (Integer i : cont){
            System.out.println(i);
        }
    }
}
