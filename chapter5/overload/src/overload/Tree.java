package overload;

public class Tree {
    int height;
    Tree()
    {
        height = 0;
        System.out.println("Planting a seedling");
    }
    Tree(int initialHeight)
    {
        height = initialHeight;
        System.out.println("Construting new Tree that is " + height + " feet tall");
    }
    void info()
    {
        System.out.println("Tree is " + height + " feet tall");
    }
    void info(String str)
    {
        System.out.println(str + ":Tree is " + height + " feet tall");
    }
}
