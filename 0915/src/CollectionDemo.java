
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("吴");
        list.add("Sehun");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array=list.toArray();
        System.out.println(Arrays.toString(array));
        for(String s:list){
            System.out.println(s);
        }
        list.remove("吴");
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
