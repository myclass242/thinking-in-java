package com.zy.io;

import java.io.*;
import java.util.LinkedList;

public class Exercise8 {
    private LinkedList<String> content;
    public Exercise8() {
        content = new LinkedList<>();
    }
    public void read(String fileName) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line;
        while(null != (line = in.readLine())) {
            content.add(line.toUpperCase());
        }
    }
    public void print() {
        StringBuilder sb = new StringBuilder();
        String line;
        while (null != (line = content.pollLast())) {
            sb.append(line + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException{
        Exercise8 e8 = new Exercise8();
        e8.read("./src/com/zy/io/Exercise7.java");
        e8.print();
    }
}
