package com.zy.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.*;
import java.util.concurrent.TimeUnit;

public class FileLocking {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file.txt");
        FileLock fl = fos.getChannel().tryLock();
        if (fl != null) {
            System.out.println("Locked file");
            TimeUnit.MILLISECONDS.sleep(100);
            fl.release();
        }
        fos.close();
    }
}
