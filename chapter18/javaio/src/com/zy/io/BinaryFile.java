package com.zy.io;

import java.io.*;

public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] data = new byte[in.available()];
            in.read(data);
            return data;
        } finally {
            in.close();
        }
    }
    public static byte[] read(String file) throws IOException {
        return read(new File(file).getAbsoluteFile());
    }
}
