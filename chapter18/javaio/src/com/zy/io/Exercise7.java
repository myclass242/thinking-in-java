package com.zy.io;

import java.io.*;
import java.util.*;

public class Exercise7 {
    private LinkedList<String> content;
    public Exercise7() {
        content = new LinkedList<>();
    }
    public void read(String fileName) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line;
        while(null != (line = in.readLine())) {
            content.add(line);
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
        Exercise7 e7 = new Exercise7();
        e7.read("./src/com/zy/io/Exercise7.java");
        e7.print();
    }
}
