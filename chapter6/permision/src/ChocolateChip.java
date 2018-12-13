import com.zy.access.dessert.Cookie;
import com.zy.access.dessert.Exercise4;
//import com.zy.access.dessert.Cookie.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip()
    {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp()
    {
        bite();
    }
    public static void main(String[] args)
    {
        ChocolateChip c = new ChocolateChip();
        c.chomp();

        Cookie ck = new Cookie();
//        ck.bite();
        Exercise4 e4 = new Exercise4();
    }
}
