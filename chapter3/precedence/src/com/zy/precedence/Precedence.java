package com.zy.precedence;

public class Precedence {
    public static void main(String args[])
    {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a + " b = " + b);

        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1: t1.level = " + t1.level + "; t2.level = " + t2.level);
        t1 = t2;
        System.out.println("2: t1.level = " + t1.level + "; t2.level = " + t2.level);
        t1.level = 27;
        System.out.println("3: t1.level = " + t1.level + "; t2.level = " + t2.level);

        Letter xl = new Letter();
        xl.c = 'a';
        System.out.println("1: xl.c = " + xl.c);
        PassObject.f(xl);
        System.out.println("2: xl.c = " + xl.c);

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));

        Value i1 = new Value();
        Value i2 = new Value();
        i1.i = i2.i = 47;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";
        System.out.println(spot.name + ":" + spot.says);
        System.out.println((scruffy.name + ":" + scruffy.says));
        Dog zz = spot;
        System.out.println(spot == scruffy);
        System.out.println(spot.equals(scruffy));
        System.out.println(spot == zz);
        System.out.println(spot.equals(zz));
        System.out.println(zz == scruffy);
        System.out.println(zz.equals(scruffy));

        int ii1 = 0x2f;
        System.out.println("ii1 = " + Integer.toBinaryString(ii1));

        float expFloat = 1.39e-34F;
        float expFloat2 = 1.39E-34f;
        System.out.println(expFloat);
        System.out.println(expFloat2);
        double expDouble = 47e47d;
        double expDouble2 = 47e47;
        System.out.println(expDouble);
        System.out.println(expDouble2);
    }
}
