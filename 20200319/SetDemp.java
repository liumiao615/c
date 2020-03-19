import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemp {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("vs");
        set.add("Sehun");
        System.out.println(set.contains("vs"));
        set.remove("vs");
       // set.clear();
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
