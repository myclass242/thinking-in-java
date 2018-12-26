package com.zy.container;

import java.util.*;

public class CrossContainerIteration {
    static void display(Iterator<String> it)
    {
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Generator gt = new Generator();
        ArrayList<String> al = new ArrayList<>();
        gt.addFilms(al, 7);
        display(al.iterator());
        LinkedList<String> ll = new LinkedList<>();
        gt.addFilms(ll, 7);
        display(ll.iterator());
        HashSet<String> hs = new HashSet<>();
        gt.addFilms(hs, 7);
        display(hs.iterator());
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        gt.addFilms(lhs, 7);
        display(lhs.iterator());
        TreeSet<String> ts = new TreeSet<>();
        gt.addFilms(ts, 7);
        display(ts.iterator());

        System.out.println("*************");
        gt.addFilms(ll, 7);
        ListIterator<String> lit = ll.listIterator();
        System.out.println(ll);
        while(lit.hasNext()){
            System.out.println(lit.next() + ", " + lit.nextIndex() + ", " + lit.previousIndex());
        }
    }
}
