import java.util.ArrayList;
import java.util.Collections;
public class TrimToSize{
    public static void main(String[] args) {
        ArrayList<String> x= new ArrayList<String>();
        x.add("hii");
        x.add("hoo");
        x.add("huu");
        x.add("vuu");
        System.out.println("Original array: " + x);
        System.out.println("Trim to size the above array: ");
        x.trimToSize();
        System.out.println(x);
    }
}
