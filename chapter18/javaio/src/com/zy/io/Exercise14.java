package com.zy.io;

import java.io.*;

public class Exercise14 {
    private static final String file1 = "Exercise14_1.out";
    private static final String file2 = "Exercise14_2.out";
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("./src/com/zy/io/Exercise14.java"));

        int lineCount;
        String line;
        long start, duration;

        in = new BufferedReader(new FileReader("./src/com/zy/io/Exercise14.java"));
        lineCount = 0;
        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(file1)));
        start = System.nanoTime();
        while ((line = in.readLine()) != null) {
            out1.println(++lineCount + ":" + line);
        }
        duration = System.nanoTime() - start;
        System.out.println("Duration:" + duration);
        out1.close();
        in.close();

        lineCount = 0;
        in = new BufferedReader(new FileReader("./src/com/zy/io/Exercise14.java"));
        PrintWriter out2 = new PrintWriter(new FileWriter(file2));
        start = System.nanoTime();
        while ((line = in.readLine()) != null) {
            out2.println(++lineCount + ":" + line);
        }
        duration = System.nanoTime() - start;
        System.out.println("Duration:" + duration);
        out2.close();
        in.close();
    }
}
