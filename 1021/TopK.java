import java.util.*;

public class TopK {
    public static Map<String, Integer> calcCount(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            int count = map.getOrDefault(w, 0);
            map.put(w, count + 1);
        }

        return map;
    }

    public static Map<Integer, List<String>> calcCountOfWords(Map<String, Integer> map) {
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

    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "is", "the", "the", "the", "sunny", "is", "is"};
        int k = 1;
        Map<String, Integer> wordCount = calcCount(words);
        System.out.println(wordCount);
        Map<Integer, List<String>> countToWordList = calcCountOfWords(wordCount);
        System.out.println(countToWordList);

        Set<Integer> counts = countToWordList.keySet();
        System.out.println(counts);
        List<Integer> countsList = new ArrayList<>(counts);
        Collections.sort(countsList, new IntegerComparator());
        /*
        Collections.sort(countsList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
         */
        //Collections.sort(countsList, (o1, o2) -> o2 - o1);
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








