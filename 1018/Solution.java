import org.omg.PortableInterceptor.INACTIVE;

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

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }

    public int singleNumber2(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            int count = map.getOrDefault(i, 0);
            map.put(i, count + 1);
        }

        Map<Integer, Integer> ret = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int a = e.getKey();
            int b = e.getValue();
            ret.put(b, a);
        }
        return ret.get(1);
    }



  //返回前K个出现次数最多的单词
  //输入["i","love","leetcode","i","love","coding"],k=2;输出：["i","love"]
    public static Map<String, Integer> topKFrequent(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for(String i:words){
            int count  = map.getOrDefault(i,0);
            map.put(i,count+1);
        }
        return map;
    }
    public static Map<Integer,List<String>> calccount(Map<String,Integer> map){
        Map<Integer,List<String>> ret = new HashMap<>();
        for(Map.Entry<String,Integer> e:map.entrySet()){
            String word = e.getKey();
            int count = e.getValue();

            if(!ret.containsKey(count)){
                ret.put(count,new ArrayList<>());
            }
            ret.get(count).add(word);
        }
        return ret;
    }
    private static class IntegerComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "is", "the", "the", "the", "sunny", "is", "is"};
        int k = 3;
        Map<String,Integer> wordCount = topKFrequent(words);
        System.out.println(wordCount);
        Map<Integer, List<String>> countToWordList = calccount(wordCount);
        System.out.println(countToWordList);

        Set<Integer> counts = countToWordList.keySet();
        System.out.println(counts);
        List<Integer> countsList = new ArrayList<>(counts);
        //       Collections.sort(countsList);
//        System.out.println(countsList);
//        Collections.sort(countsList,new IntegerComparator());
        //匿名类



//        Collections.sort(countsList, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                 return o2-o1;
//            }
//        });
//        System.out.println(countsList);
        Collections.sort(countsList, (o1, o2) -> o2-o1);
        System.out.println(countsList);

        List<String> result = new ArrayList<>();
        int n = 0;
        int i = 0;
        while (n < k) {
            int count = countsList.get(i);
            i++;
            List<String> ws = countToWordList.get(count);
            Collections.sort(ws);
            if (ws.size() <= k - n) {
                // 如果候选人数量小于需要人数，全部录取
                result.addAll(ws);
                n += ws.size();
            } else {
                // 否则，只录取需要的人数
                result.addAll(ws.subList(0, k - n));
                n += (k - n);
            }
        }
        System.out.println(result);
    }

}
