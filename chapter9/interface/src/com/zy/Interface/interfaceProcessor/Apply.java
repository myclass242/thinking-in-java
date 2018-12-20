package com.zy.Interface.interfaceProcessor;

public class Apply {
    public static void process(MyProcessor p, Object s){
        System.out.println("Using Processor:" + p.name());
        System.out.println(p.process(s));
    }
}
