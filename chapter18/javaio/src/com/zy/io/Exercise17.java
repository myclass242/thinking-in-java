package com.zy.io;

import java.util.*;
import java.io.*;

public class Exercise17 {
    public static void main(String[] args) {
        String file = "./src/com/zy/io/Exercise17.java";
        char[] chars = TextFile.read(file).toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char ch : chars) {
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.replace(ch, charCounter.get(ch) + 1);
            }
        }
        System.out.println();
        System.out.println(charCounter);
    }
}
