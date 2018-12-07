package helloDate;
//: object/HelloDate.java
import java.util.*;

/** The first thinking in java example program
 * Displays a string and today's date.
 * @author mycla
 * @version 4.0
 */

public class HelloDate {
	/** Entry point to class @ application.
	 * @param args array of string arguments
	 * @throws exceptions No exceptions throw
	 */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
        
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        
        Test1 t1 = new Test1();
        System.out.println(t1.i);
        System.out.println(t1.c);
        
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 101;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
} /* Output: (55% match)
Hello, is's: 
*///:~
