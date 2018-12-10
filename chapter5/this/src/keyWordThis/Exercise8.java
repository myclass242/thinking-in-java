package keyWordThis;

public class Exercise8
{
    void f()
    {
        System.out.println("f()");
    }
    void fun()
    {
        this.f();
        f();
    }
}
