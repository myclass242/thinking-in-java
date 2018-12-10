package initializer;

class Mug
{
    Mug(int marker)
    {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker)
    {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs
{
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mugs()
    {
        System.out.println("Mugs()");
    }
    Mugs(int i)
    {
        System.out.println("Mugs(int)");
    }
}
