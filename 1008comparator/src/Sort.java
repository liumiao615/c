import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void sort(List<Lib> books) {
        for (int i = 1; i < books.size(); i++) {
            Lib book = books.get(i);
            int j = i - 1;
            for (; j >= 0 && books.get(j).compareTo(book) > 0; j--) {
                books.set(j + 1, books.get(j));
            }
            books.set(j + 1, book);
        }
    }

    public static void sort(List<Lib> books, Comparator<Lib> c) {
        for (int i = 1; i < books.size(); i++) {
            Lib book = books.get(i);
            int j = i - 1;
            for (; j >= 0 && c.compare(books.get(j),book) > 0; j--) {
                books.set(j + 1, books.get(j));
            }
            books.set(j + 1, book);
        }
    }
}
