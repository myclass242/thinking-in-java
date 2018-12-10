package keyWordThis;

public class Main
{
    public static void main(String[] args)
    {
        Leaf lf = new Leaf();
        lf.increment().increment().increment().print();

        Exercise8 e8 = new Exercise8();
        e8.fun();

        Flower flower = new Flower();
        flower.printPetalCount();

        new Exercise9(3);
    }
}
