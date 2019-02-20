package com.zy.io;

import java.io.*;

public class TestEOF {
    public static void main(String[] args) throws IOException{
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("E:\\GIT\\thinking in java\\chapter18\\javaio\\src\\com\\zy\\io\\TestEOF.java")));
//        DataInputStream in = new DataInputStream(new FileInputStream("E:\\GIT\\thinking in java\\chapter18\\javaio\\src\\com\\zy\\io\\TestEOF.java"));
        while (in.available() != 0) {
            System.out.print((char)in.readByte());
        }
    }
}
