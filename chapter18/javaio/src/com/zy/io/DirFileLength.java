package com.zy.io;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DirFileLength {
    public static void main(String[] args) {
        File path = new File("./src/com/zy/io");
        File[] files;
        if (args.length == 0) {
            files = path.listFiles();
        } else {
            files = path.listFiles(new FileFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File fl) {
                    return pattern.matcher(fl.getPath()).matches();
                }
            });
        }
        long length = 0;
        for (File f : files) {
            System.out.print(f + ":");
            System.out.print(f.length());
            length += f.length();
        }
        System.out.println(length);
    }
}
