import java.util.Comparator;

public class Solution implements Comparator<Lib> {
    @Override
    public int compare(Lib o1, Lib o2) {
        return o1.title.compareTo(o2.title);
    }
}
