import java.util.ArrayList;
import java.util.Arrays;
public class Joining {
    public static void main(String[] args){
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        System.out.println(List1);
        ArrayList<Integer> List2 = new ArrayList<>(Arrays.asList(5,6,7));
        System.out.println(List2);
        List1.addAll(List2);
        System.out.println("After Joining:");
        System.out.println(List1);

    }
}
