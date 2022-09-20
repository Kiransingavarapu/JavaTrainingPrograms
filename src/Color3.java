import java.util.*;
public class Color3 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Blue Gray");
        list_Strings.add("Green");
        list_Strings.add("Yellow");
        list_Strings.add("White");
        list_Strings.add("Pink");
        System.out.println(list_Strings);
        String ele = list_Strings.get(0);
        System.out.println("First element: "+ele);
        ele = list_Strings.get(2);
        System.out.println("Third element: "+ele);
        ele = list_Strings.get(4);
        System.out.println("Fourth element: "+ele);
    }
}