package com.zy.array;

public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass) {
//        System.out.println(surroundingClass.getClasses());
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.getDeclaredConstructor().newInstance();
                for (int i = 0; i < size; ++i) {
                    System.out.printf(g.next() + " ");
                }
                System.out.println();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        test(RandomGenerator.class);
//        test(CountingGenerator.class)
    }
}
