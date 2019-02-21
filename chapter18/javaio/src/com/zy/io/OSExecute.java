package com.zy.io;

import java.io.*;
import java.lang.*;

class OSExecuteException extends RuntimeException {
    OSExecuteException(String why) {
        super(why);
    }
}

public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = result.readLine()) != null) {
                System.out.println(line);
            }
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((line = errors.readLine()) != null) {
                System.err.println(line);
                err = true;
            }
        } catch (Exception e) {
            if (!command.startsWith("CMD /C")) {
                command("CMD /C" + command);
            }
            else {
                throw new RuntimeException(e);
            }
        }
        if (err) {
            throw new OSExecuteException("Errors executing" + command);
        }
    }
    public static void main(String[] args) {
        OSExecute.command("javap OSExecute");
    }
}
