import java.util.HashMap;
import java.util.Map;

public class CalcCount {
    public static Map<Integer,Integer> CalcCount(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            Integer c =map.getOrDefault(i,0);
            map.put(i,c+1);
//            Integer c = map.get(i);
//            if(c == null){
//                map.put(i,1);
//            }else {
//                map.put(i,c + 1);
//            }
        }
        return map;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,4,2,7,2,3};
        Map<Integer,Integer> map = CalcCount(nums);
        System.out.println(map);
    }
}
