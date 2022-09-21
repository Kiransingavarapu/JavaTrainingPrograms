import java.util.ArrayList;
public class ReplaceingElement {
    public static void main(String[] args) {
        ArrayList<String> X = new ArrayList<String>();
        X.add("aii");
        X.add("bii");
        X.add("cii");
        X.add("dii");
        System.out.println(X);
        X.set(1, "fii");
        X.set(2, "eii");
        System.out.println(X);
    }
}