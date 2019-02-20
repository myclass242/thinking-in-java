package com.zy.io;

import java.io.*;
import java.util.LinkedList;

public class Exercise12 {
    private LinkedList<String> content;
    public Exercise12() {
        content = new LinkedList<>();
    }
    public void read(String fileName) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = in.readLine()) != null) {
            content.add(line);
        }
        in.close();
    }
    public void print(String fileName) throws IOException{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        String line;
        int lineCount = 0;
        while (null != (line = content.pollLast())) {
            out.println(++lineCount + ":" + line);
        }
        out.close();
        System.out.println(BufferedInputFiler.read(fileName));
    }

    public static void main(String[] args) throws IOException{
        Exercise12 e12 = new Exercise12();
        e12.read("./src/com/zy/io/Exercise7.java");
        e12.print("Exercise12.out");
    }
}
