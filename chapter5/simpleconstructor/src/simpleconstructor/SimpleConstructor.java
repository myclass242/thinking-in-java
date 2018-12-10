package simpleconstructor;

public class SimpleConstructor
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; ++i)
        {
            new Rock();
            new Rock2(i);
        }
        Exercise1 e1 = new Exercise1();
        assert(e1.str == null);
        Exercise2 e2 = new Exercise2("Hello Java from constructor");
        System.out.println("\ne2.str1:" + e2.str1);
        System.out.println("e2.str2:" + e2.str2);
        System.out.println("e2.str3:" + e2.str3);
    }
}
