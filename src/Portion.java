import java.util.*;
public class Portion {
    public static void main(String[] args) {
        List<String> cuntries = new ArrayList<String>();
        cuntries.add("Canada");
        cuntries.add("Germany");
        cuntries.add("France");
        cuntries.add("Belgium");
        cuntries.add("India");
        System.out.println("Original countries: " + cuntries);
        List<String> sub_cuntries = cuntries.subList(0, 2);
        System.out.println("List of first 2 countries: " + sub_cuntries);
    }
}