import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        System.out.println(map.get("Sehun"));
        map.put(1,"Sehun");
        System.out.println(map.get(1));
        System.out.println(map);
        map.put(1,"kai");
        System.out.println(map.get(1));
        map.put(2,"chen");
        map.put(3,"D.o");
        System.out.println(map);
        System.out.println(map.get(2));
        for(Integer key:map.keySet()){
            System.out.println(key);
        }
        for(String value:map.values()){
            System.out.println(value);
        }
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
