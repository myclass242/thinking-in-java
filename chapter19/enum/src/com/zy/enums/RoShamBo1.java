package com.zy.enums;

import java.util.*;
import static com.zy.enums.Outcome.*;

interface Item {
    Outcome eval(Paper p);
    Outcome eval(Scissors s);
    Outcome eval(Rock r);
    Outcome compete(Item item);
}

class Paper implements Item {
    public Outcome eval(Paper p) { return DRAW; }
    public Outcome eval(Scissors s) { return WIN; }
    public Outcome eval(Rock r) { return LOSE; }
    public Outcome compete(Item item) { return item.eval(this); }
    public String toString() { return "Paper"; }
}

class Scissors implements Item {
    public Outcome eval(Scissors s) { return DRAW; }
    public Outcome eval(Paper p) { return LOSE; }
    public Outcome eval(Rock r) { return WIN; }
    public Outcome compete(Item item) { return item.eval(this); }
    public String toString() { return "Scissors"; }
}

class Rock implements Item {
    public Outcome eval(Scissors s) { return LOSE; }
    public Outcome eval(Paper p) { return WIN; }
    public Outcome eval(Rock r) { return DRAW; }
    public Outcome compete(Item item) { return item.eval(this); }
    public String toString() { return "Rock"; }
}

public class RoShamBo1 {
    private static Random rand = new Random(47);
    public static Item newItem() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Scissors();
            case 1: return new Paper();
            case 2: return new Rock();
        }
    }
    public static void match(Item a, Item b) {
        System.out.println(a + " vs " + b + ": " + a.compete(b));
    }
    public static void main(String[] args) {
        for (int i = 0; i < 25; ++i) {
            match(newItem(), newItem());
        }
    }
}
