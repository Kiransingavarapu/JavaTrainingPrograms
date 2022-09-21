import java.util.*;
public class Shuffle {
    public static void main (String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(86);
        Numbers.add(99);
        Numbers.add(44);
        Numbers.add(90);
        Numbers.add(77);
        System.out.println("Original Numbers : " + Numbers);
        Collections.shuffle(Numbers);
        System.out.println("Shuffled Numbers : " + Numbers);
    }
}
