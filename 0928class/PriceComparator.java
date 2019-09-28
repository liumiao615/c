import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    /**
     * true 代表 从小到大，false 代表 从大到小
     */
    boolean asc;

    public PriceComparator(boolean asc) {
        this.asc = asc;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if (asc) {
            return o1.price - o2.price;
        } else {
            return o2.price - o1.price;
        }
    }
}
