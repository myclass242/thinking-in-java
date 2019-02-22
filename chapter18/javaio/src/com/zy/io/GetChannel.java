package com.zy.io;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class GetChannel {
    private static final int BSIZE = 1024;
    public static void main(String[] args) throws IOException{
        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new RandomAccessFile("data.txt", "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap(" some more".getBytes()));
        fc.close();

        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(1024);
        fc.read(buff);
        buff.flip();
//        while (buff.hasRemaining()) {
//            System.out.print((char)(buff.get()));
//        }

        System.out.println(buff.asCharBuffer().toString());
        CharBuffer chBuff = Charset.forName(System.getProperty("file.encoding")).decode(buff);
        System.out.println(chBuff);


    }
}
