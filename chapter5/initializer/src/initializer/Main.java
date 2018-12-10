package initializer;

import java.util.*;

public class Main
{
    public static void main(String[] argc)
    {
        House h = new House();
        h.f();

        System.out.println("Creating new Cupboard in main");
        new Cupboard();
        System.out.println("Creating new Cupboard in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

        System.out.println("Inside main");
//        Cups.cup1.f(99);

        new Mugs();
        System.out.println("new Mugs completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");

        Exercise15 e15 = new Exercise15();
        e15.print();

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for (int i = 0; i < a2.length; ++i)
        {
            a2[i] = a2[i] + 1;
        }
        for (int i = 0; i < a1.length; ++i)
        {
            System.out.println("a1[" +  i + "] = " + a1[i]);
        }

        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a is " + a.length);
        System.out.println(Arrays.toString(a));

        rand.setSeed(47);
        Integer[] ai = new Integer[rand.nextInt(20)];
        System.out.println("lenght og ai is " + ai.length);
        System.out.println(Arrays.toString(ai));
        for (int i = 0; i < ai.length; ++i)
        {
            ai[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(ai));

        Other.main(new String[]{"fiddle", "de", "dum"});

        String[] strArr = new String[]{"Hello", "Java", "World"};
        for (String str : strArr)
        {
            System.out.println(str);
        }
        System.out.println(Arrays.toString(strArr));

        Exercise17[] e17 = new Exercise17[rand.nextInt(20)];
        for (Exercise17 e : e17)
        {
            e = new Exercise17("wa");
        }

        printArray(new Object[]{new Integer(47), new Float(3.14), new Double(11.11)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});

        newPrintArray(new Integer(47), new Float(3.14));
        newPrintArray(47, 3.14, 11.11);
        newPrintArray("one", "two", "three");
        newPrintArray((Object[])new Integer[]{1, 2, 4, 5});
        newPrintArray();
    }
    static void printArray(Object[] args)
    {
        for (Object obj : args)
        {
            System.out.print(obj +  " ");
        }
        System.out.println();
    }
    static void newPrintArray(Object... args)
    {
        for (Object obj : args)
        {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();
}

class Other
{
    public static void main(String[] args)
    {
        for (String str : args)
        {
            System.out.println(str);
        }
    }
}

class A{}
