import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Buy {
    public static void Find(String s1,String s2){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Find(s1,s2);
        //商人手上每个珠子的统计
        Map<Character,Integer> ms1 = new HashMap<>();
        for(char c:s1.toCharArray()){
            if(ms1.containsKey(c)) {
                ms1.put(c, ms1.get(c) + 1);
            }else {
                ms1.put(c,1);
            }
        }
        //用户手上每个珠子的统计
        Map<Character,Integer> ms2 = new HashMap<>();
        for(char c:s2.toCharArray()){
            if(ms2.containsKey(c)) {
                ms2.put(c, ms2.get(c) + 1);
            }else {
                ms2.put(c,1);
            }
        }
        //差值
        boolean weatherBy = true;
        int lack = 0;
        for(Map.Entry<Character,Integer> en: ms2.entrySet() ){
            char K = en.getKey();
            int v = en.getValue();
            if(ms1.containsKey(K) && ms1.get(K) < v){
                weatherBy = false;
                lack += v - ms1.get(K);
            }else if(!ms1.containsKey(K)){
                weatherBy = false;
                lack += v;
            }
        }
        if(weatherBy){
            System.out.println("Yes" + (s1.length() - s2.length()));
        }else {
            System.out.println("No" + lack);
        }
    }

}
