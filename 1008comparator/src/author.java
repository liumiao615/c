import java.util.Comparator;

public class author implements Comparator<Lib> {

    @Override
    public int compare(Lib o1, Lib o2) {
        return o1.author.compareTo(o2.author);
    }
}
