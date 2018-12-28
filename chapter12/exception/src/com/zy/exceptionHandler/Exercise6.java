package com.zy.exceptionHandler;

import java.io.PrintWriter;
import java.util.logging.*;
import java.io.StringWriter;

class Exercise6Exception1 extends Exception {
    private static Logger logger =
            Logger.getLogger("Exercise6Exception1");
    Exercise6Exception1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    Exercise6Exception1(String msg) {
        super(msg);
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Exercise6Exception2 extends Exception {
    private static Logger logger =
            Logger.getLogger("Exercise6Exception2");
    Exercise6Exception2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    Exercise6Exception2(String msg) {
        super(msg);
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new Exercise6Exception1();
        } catch (Exercise6Exception1 e) {
            System.err.println(e);
        }
    }
}
