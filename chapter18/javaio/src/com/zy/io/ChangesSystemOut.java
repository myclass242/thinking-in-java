package com.zy.io;

import java.io.*;

public class ChangesSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out), true);
        out.println("Hello World");
        o.println("Hello Java");
    }
}
