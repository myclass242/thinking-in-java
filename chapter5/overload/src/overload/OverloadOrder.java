package overload;

/*
* 参数顺序的不同也可以实现重载，但这会使得代码难以阅读和维护，通常不建议这样做
* */

public class OverloadOrder
{
    void f(String str, int i)
    {
        System.out.println("String: " + str + ", int: " + i);
    }
    void f(int i, String str)
    {
        System.out.println("int: " + i + ":String: " + str);
    }
}
