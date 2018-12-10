package keyWordThis;

public class Exercise9
{
    int k = 0;
    String str;
    Exercise9()
    {
        str = "Hello Java";
        System.out.println("Default constructor");
    }
    Exercise9(int k)
    {
        this();
        this.k = k;
        System.out.println("Exercise(int)");
    }
}
