package com.zy.io;

import java.io.*;

public class BasicFileOutput {
    private static final String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFiler.read("./src/com/zy/io/BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        int lineCount = 0;
        String line;
        while ((line = in.readLine()) != null) {
            out.println(++lineCount + ":" + line);
        }
        out.close();
        System.out.print(BufferedInputFiler.read(file));
    }
}
