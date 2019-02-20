package com.zy.io;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class SortedDirList {
    private String[] fileList;
    public SortedDirList(File path) {
        fileList = path.list();
        Arrays.sort(fileList, String.CASE_INSENSITIVE_ORDER);
    }
    public String[] list() {
        return fileList;
    }
    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> matchFileList = new ArrayList<>();
        for (String s : fileList) {
            if (pattern.matcher(s).matches()) {
                matchFileList.add(s);
            }
        }
        return matchFileList.toArray(new String[matchFileList.size()]);
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String s : fileList) {
            str.append(s + "\n");
        }
        return str.toString();
    }
    public static void main(String[] args) {
        SortedDirList dirList = new SortedDirList(new File("./src/com/zy/io"));
        System.out.println(dirList);
        for (String s : dirList.list()) {
            System.out.print(s);
        }
        System.out.println();
        for (String s : dirList.list(".+\\.java")) {
            System.out.println(s);
        }
    }
}
