package com.zy.rtti;

class A {}
class B extends A {}
class C extends B {}

public class Exercise8 {
    public static void hierarchy(Object obj) {
        if (obj.getClass().getSuperclass() != null) {
            System.out.println(obj.getClass() + " is subclass of " + obj.getClass().getSuperclass());
            Object[] os = obj.getClass().getDeclaredFields();
            for (Object o : os) {
                System.out.println("Object: " + o);
            }
        } try {
            hierarchy(obj.getClass().getSuperclass().newInstance());
        } catch (InstantiationException e) {
            System.out.println("Unable to instantice obj");
        } catch (IllegalAccessException e) {
            System.out.println("Unbale to acess");
        }
    }
    public static void main(String[] args) {
        hierarchy(new C());
    }
}
