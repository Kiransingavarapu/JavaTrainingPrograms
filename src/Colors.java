import java.util.*;
public class Colors{
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        list_Strings.add(0, "Pink");
        list_Strings.add(2, "Yellow");
        System.out.println(list_Strings);
    }
}

