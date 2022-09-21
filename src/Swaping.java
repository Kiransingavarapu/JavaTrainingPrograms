import java.util.ArrayList;
import java.util.Collections;
public class Swaping {
    public static void main(String a[])
    {
        ArrayList<String> FistList = new ArrayList<String>();
        FistList.add("Singavarapu");
        FistList.add("Kiran");
        FistList.add("Kumar");
        FistList.add("Hello");
        FistList.add("World");
        System.out.println("Before Swap");
        System.out.println(FistList);
        Collections.swap(FistList, 1, 2);
        System.out.println("After Swap");
        System.out.println(FistList);
    }
}
