package com.zy.string;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String str, Formatter fmt) {
        name = str;
        f = fmt;
    }
    public void move(int x, int y) {
        f.format("%s Turtle is at (%d, %d)\n", name, x, y);
    }
    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        
    }
}
