import java.util.*;

public class Test {
    public static Map<String,Integer> term(String[] array){
        Map<String,Integer> map = new HashMap<>() ;
        for(String s:array){
          int count = map.getOrDefault(s,0);
          map.put(s,count +1);
        }
        return map;
    }
    public static Map<Integer,List<String>> ttt(Map<String,Integer> map){
        Map<Integer, List<String>> ret = new HashMap<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String word = e.getKey();
            int count = e.getValue();

            if (!ret.containsKey(count)) {
                ret.put(count, new ArrayList<>());
            }
            ret.get(count).add(word);
        }

        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {"BUTTER" ," ", "FLOUR", " ","HONEY"," ","FLOUR"};
        Map<String,Integer> test1 = term(array);
        System.out.println(test1);
        Map<Integer,List<String>> tttt = ttt(test1);
        System.out.println(tttt);
    }
}
