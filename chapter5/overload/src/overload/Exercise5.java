package overload;

public class Exercise5
{
    void bark()
    {
        System.out.println("quiet");
    }
    void bark(char c)
    {
        System.out.println("cawcaw");
    }
    void bark(byte b)
    {
        System.out.println("barkbark");
    }
    void bark(short s)
    {
        System.out.println("slurpsslurp");
    }
    void bark(int i)
    {
        System.out.println("iyow");
    }
    void bark(long l)
    {
        System.out.println("lalala");
    }
    void bark(float f)
    {
        System.out.println("fififoofm");
    }
    void bark(double d)
    {
        System.out.println("dodo");
    }
    void overloadOrder(char c, byte b)
    {
        System.out.println("char byte");
    }
    void overloadOrder(byte b, char c)
    {
        System.out.println("byte char");
    }
}
