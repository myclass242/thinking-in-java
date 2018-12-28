package com.zy.exceptionHandler;

class Exercise4Exception extends Exception {
    Exercise4Exception(String s)
    {
        message = s;
    }
    String what()
    {
        return message;
    }
    private String message;
}

public class Exercise4 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            throw new Exercise4Exception("i donnot kone what to write");
        } catch (Exercise4Exception e) {
            System.out.println("catch block:" + e.what());
        } finally {
            System.out.println("finally block");
        }
    }
}
