import java.util.ArrayList;
public class DifferentMovies {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("Thor");
        movies.add("Black Window");
        movies.add("Spider Man");
        movies.set(1, "The Hulk");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }
}
