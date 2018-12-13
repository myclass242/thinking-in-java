import static com.zy.util.Print.*;
import com.zy.access.dessert.*;

public class PrintTest {
    public static void main(String[] args)
    {
        print("Avaliable from now on");
        print(100);
        print(100L);
        print(3.1415926);

        Cookie x = new Cookie();
//        x.bite();     //can'n acess
    }
}
