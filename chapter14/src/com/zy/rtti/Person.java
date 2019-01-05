package com.zy.rtti;

//A class with Null object

public class Person {
    public final String first;
    public final String second;
    public final String address;
    public Person(String first, String second, String address) {
        this.first = first;
        this.second = second;
        this.address = address;
    }
    public String toString() {
        return "Person:" + first + second + " : " + address;
    }
    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }
        public String toString() {
            return "NullPerson";
        }
    }
    public static final Person NULL = new NullPerson();
}
