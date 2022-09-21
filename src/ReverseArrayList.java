
import java.util.ArrayList;
        import java.util.Collections;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Ki");
        arrayList.add("RA");
        arrayList.add("N");
        arrayList.add("KU");
        arrayList.add("MAR");
        System.out.println("Before Reverse Order: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order: " + arrayList);
    }
}
