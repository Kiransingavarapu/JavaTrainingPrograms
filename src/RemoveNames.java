import java.util.*;
public class RemoveNames {
    public static void main(String[] args) {
        List<String> money_heist = new ArrayList<String>();
        money_heist.add("The Professor");
        money_heist.add("Tokyo");
        money_heist.add("Berlin");
        money_heist.add("Rauel");
        money_heist.add("Nairobi");
        money_heist.add("Alison");
        money_heist.add("Rio");
        System.out.println(money_heist);
        money_heist.remove(2);
        money_heist.remove(5);
        System.out.println("After removing third element from the list:\n"+money_heist);
    }
}