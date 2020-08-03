package J0802;

import java.util.*;

public class NotNullStr {
    public static void Find(String S){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c:S.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Integer,Character> ret = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            char cc = e.getKey();
            int dd = e.getValue();
            ret.put(dd,cc);
        }

        if(ret.get(1) != null){
            System.out.println(ret.get(1));
        }else {
            System.out.println(-1);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[100];
        int i = 0;
        while(scanner.hasNext()){
            arr[i++] = scanner.next();
        }
        for(int j = 0;j < i;j++){
            Find(arr[j]);
        }
        //Find("IshLhgfgfgfuop");
    }


//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    while(scanner.hasNext()){
//        String str = scanner.next();
//        char[] arr = str.toCharArray();
//        for(int i  = 0;i < arr.length;i++){
//            if(str.indexOf(arr[i]) == str.lastIndexOf(arr[i])){
//                System.out.println(arr[i]);
//            }
//        }
//        System.out.println(-1);
//    }
//}
}
