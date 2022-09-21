import java.util.ArrayList;
public class EmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        if(myList.isEmpty())
        {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
    }
}
