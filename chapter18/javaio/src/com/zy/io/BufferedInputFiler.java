package com.zy.io;

import java.io.*;

public class BufferedInputFiler {
    public static String read(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            content.append(line + "\n");
        }
        in.close();
        return content.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(BufferedInputFiler.read("./src/com/zy/io/BufferedInputFiler.java"));
    }
}
