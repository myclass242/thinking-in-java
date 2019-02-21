package com.zy.io;

import java.io.*;
import java.util.*;

public class TextFile extends ArrayList<String> {
    // Read file as a single string
    public static String read(String file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(file).getAbsoluteFile()));
            try {
                String line;
                while ((line = in.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    // write a single file in one method
    public static void write(String file, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(file).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Read a file,split by any regular expression
    public TextFile(String file, String splitter) {
        super(Arrays.asList(read(file).split(splitter)));
        if (get(0) == " ") {
            remove(0);
        }
    }
    //Normally read by lines
    public TextFile(String file)
    {
        this(file, "\n");
    }
    public void write(String file) {
        try {
            PrintWriter out = new PrintWriter(new File(file).getAbsoluteFile());
            try {
                for (String item : this) {
                    out.println(item);
                }
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String textFile = "./src/com/zy/io/TextFile.java";
        String textTest = "./src/com/zy/io/TextTest.txt";
        String file = read(textFile);
//        System.out.print(file);
        write(textTest, file);
        System.out.print(read(textTest));
    }
}
