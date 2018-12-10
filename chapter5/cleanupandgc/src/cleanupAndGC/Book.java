package cleanupAndGC;

public class Book
{
    boolean checkedOut = false;
    Book(boolean CheckOut)
    {
        checkedOut = CheckOut;
    }
    void checkIn()
    {
        checkedOut = false;
    }
    protected void finalize()
    {
        if (checkedOut)
        {
            System.out.println("Error: checked out");
        }
        //Normally, you'll do this
//        super.finalize();     //call the base class version
    }
}
