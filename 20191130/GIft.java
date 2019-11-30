
import java.util.HashMap;
import java.util.Map;

public class GIft {
    public static Map<Integer,Integer> Valu(int[] gifts,int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int count = map.getOrDefault(gifts[i],0);
            map.put(gifts[i],count + 1);
        }
        return map;
    }
    public static int calcCount(Map<Integer, Integer> map, int n) {
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            //int A= e.getKey();
            int B = e.getValue();
            if (B > n / 2) {
                return e.getKey();
            }
        }
        return 0;
    }
    public static int getValue(int[] gifts, int n) {
        Map<Integer, Integer> map = Valu(gifts, n);
        int C = calcCount(map,n);
        return C;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,2,2};
        int T = getValue(A,A.length);
        System.out.println(T);
    }
}
