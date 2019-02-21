package com.zy.io;

import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = stdin.readLine()) != null && line.length() != 0) {
            System.out.println(line);
        }
    }
}
