package com.zy.array;

import java.util.*;

public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<>();
        ls[1] = new ArrayList<>();

        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

    }
}
