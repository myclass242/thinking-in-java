package initializer;

public class NewVarArgs {
    static void printArray(Object... args)
    {
        for (Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
