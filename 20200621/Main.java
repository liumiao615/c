for(String key:map.keyset()){
	Integer value = map.get(key);
}

for(Map.Entry<String,Integer> entry:map.entrySet()){
	String key = entry.getKey();
	Integer value = entry.getValue();
}
//遍历key和value
public class Main{
    public static void main(String[] args){
        Map<String Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("pear",2);
        map.put("banana",3);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
//遍历key
public class Main{
    public static void main(String[] args){
        Map<String Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("pear",2);
        map.put("banana",3);
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}