package foreach;

import java.util.*;

public class Foreach
{
    public static void main(String args[])
    {
        Random rand = new Random(47);
        float value[] = new float[10];
        for (int i = 0; i < 10; ++i)
        {
            value[i] = rand.nextFloat();
        }
        for (float x : value)
        {
            System.out.println(x);
        }
        System.out.println("***********");
        Ft valueF[] = new Ft[10];
        for (int i = 0; i < 10; ++i)
        {
            valueF[i] = new Ft();
            valueF[i].value = rand.nextFloat();
        }
        for (Ft ft : valueF)
        {
            System.out.println(ft.value);
            ft.value += 1.0;
        }
        for (Ft ft : valueF)
        {
            System.out.println(ft.value);
        }

        for (char c : "Hello World!".toCharArray())
        {
            System.out.println(c);
        }
    }
}
