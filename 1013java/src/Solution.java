import java.util.*;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new TreeSet<>();
        for (char j : J.toCharArray()) {
            jewels.add(j);
        }
        int count = 0;
//        for(int i = 0;i < S.length();i++){
//            char c = S.charAt(i);
//
//        }
        for (char s : S.toCharArray()) {
            if (jewels.contains(s)) {
                count++;
            }
        }
        return count;
    }






//    public Map<Integer,List<String>> topKFrequent(String[] words ){
//        Map<String, Integer> count = new TreeMap<>();
//        for (String word : words) {
//            count.put(word, count.getOrDefault(word, 0));
//        }
//        List<String> candidates = new ArrayList(count.keySet());
//
//    }




    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }
    public int singleNumber2(int[] nums){

        Map<Integer,Integer> map = new TreeMap<>();
        for(int i:nums){
            int count = map.getOrDefault(i,0);
            map.put(i,count + 1);
        }

        Map<Integer,Integer> ret = new HashMap<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int a = e.getKey();
            int b = e.getValue();
            ret.put(b,a);
            }
        return ret.get(1);









//    public static Map<Integer,List<Integer>> calc(Map<Integer,Integer> map){
//        Map<Integer,List<Integer>> ret = new HashMap<>();
//        for(Map.Entry<Integer,Integer> e:map.entrySet()){
//            int a = e.getKey();
//            int b = e.getValue();
//
//            if(!ret.containsKey(b)){
//                ret.put(b,new ArrayList<>());
//            }
//            ret.get(b).add(a);
//        }
//        return ret;
//    }

}
