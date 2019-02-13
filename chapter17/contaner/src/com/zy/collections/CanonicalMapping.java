package com.zy.collections;

import java.lang.ref.*;
import java.util.*;

class Element {
    private String ident;
    public Element(String id) {
        ident = id;
    }
    public int hashCode() {
        return ident.hashCode();
    }
    public boolean equals(Object o) {
        return o instanceof Element &&
                ident.equals(((Element)o).ident);
    }
    public String toString() {
        return ident;
    }
    protected void finalize() {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {
    public Key(String id) {
        super(id);
    }
}

class Value extends Element {
    public Value(String id) {
        super(id);
    }
}

public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 1000;
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; ++i) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0) {
                keys[i] = k;
            }
            map.put(k, v);
        }
        System.gc();
    }
}
