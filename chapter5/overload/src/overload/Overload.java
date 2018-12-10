package overload;

public class Overload
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; ++i)
        {
            Tree tr = new Tree(i);
            tr.info();
            tr.info("overload methon");
        }
        Tree tr2 = new Tree();
        tr2.info();
        tr2.info("overload methon");

        OverloadOrder or = new OverloadOrder();
        or.f("string first", 11);
        or.f(99, "string second");

        new Exercise3();
        new Exercise3("string");

        Exercise5 e5 = new Exercise5();
        e5.bark();
        e5.bark('c');
        e5.bark((byte)1);
        e5.bark((short)1);
        e5.bark(1);
        e5.bark(1L);
        e5.bark(1.0f);
        e5.bark(1.0);
        e5.overloadOrder((byte)'c', 'c');
        e5.overloadOrder('c',(byte)1);
    }
}
