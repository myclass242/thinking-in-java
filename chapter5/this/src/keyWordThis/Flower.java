package keyWordThis;

public class Flower
{
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals)
    {
        petalCount = petals;
        System.out.println("constructor w/ int arg only, petalCount = " + petalCount);
    }
    Flower(String ss)
    {
        System.out.println("constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals)
    {
        this(petals);
//        this(s);  Call to 'this()' must be first statement in constructor body
        this.s = s;
        System.out.println("string and int args");
    }
    Flower()
    {
        this("hi", 47);
        System.out.println("default constructor, no args");
    }
    void printPetalCount()
    {
//        this(11);     call to this() must be first statement in constructor body
        System.out.println("s = " + s + ",petalCount = " + petalCount);
    }
}
