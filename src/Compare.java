import java.util.*;
public class Compare {
    public static void main(String args[])
    {
        ArrayList<String> first=new ArrayList<String>();
        first.add("Singavarapu");
        first.add("Kiran");
        first.add("Kumar");
        System.out.println(first);
        List<String> second=new ArrayList<String>();
        second.add("Singavarapu");
        second.add("Kiran");
        second.add("Kumar");
        System.out.println(second);
        boolean comparing = first.equals(second);
        System.out.println(comparing);
        second.add("King");
        boolean comparing1 = first.equals(second);
        System.out.println(comparing1);
    }
}
