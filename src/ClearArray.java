import java.util.ArrayList;
        import java.util.Arrays;
public class ClearArray
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("aiii", "biii", "ciii", "diii", "eiii"));
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
