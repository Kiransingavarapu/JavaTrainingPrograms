import java.util.*;
public class Color2 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Light Green");
        list_Strings.add("White");
        list_Strings.add("chocolate");
        System.out.println(list_Strings);
        list_Strings.add(0, "Lime");
        System.out.println(list_Strings);
    }
}