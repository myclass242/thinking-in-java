package com.zy.container;

import java.util.*;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T v) {storage.addFirst(v);}
    public T pop() {return storage.removeFirst();};
    public T peek() {return storage.getFirst();};
    public boolean empty() {return storage.isEmpty();};
    public String toString() {return storage.toString();};

    public void exercise15(String str)
    {
        Stack<Character> stack = new Stack<>();
        char[] strArr = str.toCharArray();
        for (int pos = 0; pos !=strArr.length; ++pos){
            if (strArr[pos] == '+'){
                stack.push(strArr[++pos]);
            }
            else if (strArr[pos] == '-'){
                System.out.print(stack.pop());
            }
            else{
                stack.push(strArr[pos]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }

        stack.exercise15("+U+n+c--+e+r+t--+a-+i-+n+t+y---+-+r+u--+l+e+s---");
    }
}
