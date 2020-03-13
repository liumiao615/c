import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BrokeKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
//        String s1 = "lnglabglaebg3o30gb3bhlkbhglkwbhklwehgeghehrhw54u5j54j54j4";
//        String s2 = "ngabgabgo0gbbbgbgg";
        System.out.println(s1.length());
        System.out.println(s2.length());
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new TreeMap<>();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = new char[arr1.length];
        int count = 0;
        for(char c:s2.toCharArray()){
            arr2[count++] = c;
        }
        //arr2[] = s2.toCharArray();
        //char[] arr2 = s2.toCharArray();
        int i = 0;
        int j = 0;

        while(i < arr1.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            }else {
                if(arr1[i] >= 'a' && arr1[i] <= 'z'){
                    map.put((char) (arr1[i] - 32),map.getOrDefault((char) (arr1[i] - 32),0) + 1);
                    if(map.get((char)(arr1[i] - 32)) == 1){
                        sb.append((char)(arr1[i] - 32));
                    }
                }else {
                    map.put(arr1[i],map.getOrDefault((arr1[i]),0) + 1);
                    if(map.get(arr1[i]) == 1){
                        sb.append(arr1[i]);
                    }
                }
                i++;
            }
        }
        System.out.println(sb);
    }
}
