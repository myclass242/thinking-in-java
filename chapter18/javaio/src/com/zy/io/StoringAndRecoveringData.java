package com.zy.io;

import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException{
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
        out.writeDouble(3.1415926);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square of 2");
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
        System.out.println(in.readDouble());
//        System.out.println(in.readChar());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        in.close();
    }
}
