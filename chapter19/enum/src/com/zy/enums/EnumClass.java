package com.zy.enums;

enum Shrubbery {GROUND, GRAWLING, HANGING};

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s + " ordinal:" + s.ordinal());
            System.out.println(s.compareTo(Shrubbery.GRAWLING));
            System.out.println(s.equals(Shrubbery.GRAWLING));
            System.out.println(s == Shrubbery.GRAWLING);
            System.out.println(s.getDeclaringClass());
            System.out.println(s.name());
            System.out.println("-----------------------");
        }

        for (String s : "GROUND GRAWLING HANGING".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            shrub = Shrubbery.valueOf(s);
            System.out.println(shrub);
        }
    }
}
