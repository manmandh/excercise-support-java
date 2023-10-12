package ex2p2;
import java.util.ArrayList;
import java.util.List;

public class TestBook {
    public static void main(String[] args) {

        List<Author> ds = new ArrayList<>();

        Author[] authors = new Author[2];

        authors[0]= new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1]= new Author("Paul Tan", "Paul@nowhere.com", 'm');
        ds.add(authors[0]);
        ds.add(authors[1]);

        System.out.println(authors[0]);
        System.out.println(authors[1]);

        Book javaDummy = new Book("Java for Dummy",ds, 19.99, 99);
        System.out.println(javaDummy);
    }
}
