package com.zy.collections;

import java.util.*;

class StringAddress {
    private String s;
    public StringAddress(String s) { this.s = s; }
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> lt = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(lt);
        Collections.fill(lt, new StringAddress("World"));
        System.out.println(lt);
    }
}
