
import java.util.Scanner;
import java.util.*;
public class CharTotal {
    public static Map<Character, Integer> Total(String Ss){
        Map<Character,Integer> map = new TreeMap<>();
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(char ss: arr){
            map.put(ss,map.getOrDefault(ss,0));
        }
        for(char C:Ss.toCharArray()) {
            if (C >= 'A' && C <= 'Z') {
                map.put(C, map.getOrDefault(C,0) + 1);
            }
        }
        //foreach不能应用于String类型
        return map;
    }
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        String S = sca.nextLine();
        Map<Character,Integer> map = Total(S);
        //map = Total(S);
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey() + ":" + e.getValue());
        }

    }
}
