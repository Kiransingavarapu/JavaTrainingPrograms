import java.util.*;
public class ArraySorting {
    public static void main(String args[])
    {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(77);
        Numbers.add(76);
        Numbers.add(98);
        Numbers.add(99);
        Numbers.add(39);
        Numbers.add(40);
        Numbers.add(57);
        System.out.println("ArrayList Before:");
        for(int TotalNumbers : Numbers)
        {
            System.out.println(TotalNumbers);
        }
        Collections.sort(Numbers);
        System.out.println("ArrayList After:");
        for(int TotalNumbers: Numbers)
        {
            System.out.println(TotalNumbers);
        }
    }
}
