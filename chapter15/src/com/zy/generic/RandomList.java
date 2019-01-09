package com.zy.generic;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random();
    public void add(T a) {storage.add(a);}
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " +
        "The lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; ++i) {
            System.out.println(rs.select() + " ");
        }
    }
}
