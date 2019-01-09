package com.zy.generic;

class ClassAsFactory<T> {
    private T x;
    ClassAsFactory(Class<T> kind) {
        try {
            x = kind.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    T get() {
        return x;
    }
}

class A {}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<A> ca = new ClassAsFactory<>(A.class);
        ClassAsFactory<Integer> ci = new ClassAsFactory<>(Integer.class);
    }
}
