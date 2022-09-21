
import java.util.*;
public class Replace {
    public static void main (String[] args) {
        List<String> movies = new ArrayList<String>();
        movies.add("KGF");
        movies.add("MoonFall");
        movies.add("Viruman");
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Hi");
        list.add("World");
        Collections.copy(list,movies);
        System.out.println(list);
    }
}
