package com.zy.io;

import java.io.*;

public class FormatedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFiler.read("E:\\GIT\\thinking in java\\chapter18\\javaio\\src\\com\\zy\\io\\FormatedMemoryInput.java").getBytes()
            ));
            while (true) {
                System.out.print((char)in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
