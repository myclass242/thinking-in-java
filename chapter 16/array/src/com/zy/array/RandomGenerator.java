package com.zy.array;

import java.lang.*;
import java.util.Random;

public class RandomGenerator {
    private static Random rand = new Random(47);
    public static class Boolean implements Generator<java.lang.Boolean> {
        public java.lang.Boolean next() {
            return rand.nextBoolean();
        }
    }
    public static class Byte implements Generator<java.lang.Byte> {
        public java.lang.Byte next() {
            return (byte)rand.nextInt();
        }
    }
    public static class Character implements Generator<java.lang.Character> {
        public java.lang.Character next() {
            return CountingGenerator.chars[rand.nextInt(CountingGenerator.chars.length)];
        }
    }
    public static class String extends CountingGenerator.String {
        {cg = new Character();}
        public String() {}
        public String(int length) { super(length); }
    }
    public static class Short implements Generator<java.lang.Short> {
        public java.lang.Short next() {
            return (short)rand.nextInt();
        }
    }
    public static class Integer implements Generator<java.lang.Integer> {
        public java.lang.Integer next() {
            return rand.nextInt();
        }
    }
    public static class Long implements Generator<java.lang.Long> {
        public java.lang.Long next() {
            return rand.nextLong();
        }
    }
    public static class Float implements Generator<java.lang.Float> {
        public java.lang.Float next() {
            return rand.nextFloat();
        }
    }
    public static class Double implements Generator<java.lang.Double> {
        public java.lang.Double next() {
            return rand.nextDouble();
        }
    }
}
