package com.zy.io;

import java.nio.channels.*;
import java.io.*;
import java.nio.*;

public class LargedMappedFiles {
    static int length = 0x8FFFFFF;
    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile("text.data", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; ++i) {
            out.put((byte)'x');
        }
        System.out.println("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; ++i) {
            System.out.println((char)out.get(i));
        }
    }
}
