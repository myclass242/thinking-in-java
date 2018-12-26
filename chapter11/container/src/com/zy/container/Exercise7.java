package com.zy.container;

import java.awt.*;
import java.util.*;

class A{}

public class Exercise7 {
    public static void main(String[] args)
    {
        A[] arr = new A[]{new A(), new A(), new A(), new A(), new A()};
        LinkedList<A> la = new LinkedList<>();
        Collections.addAll(la, arr);
        la.subList(1, 3).clear();
        System.out.println(la);
    }
}
