import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            ArrayList<String> list = new ArrayList<String>();
//            int n  = scanner.nextInt();
//            for(int i  = 0;i < n;i++){
//                String str = scanner.next();
//                str = str.replace("-","");
//                String result = "";
//                for(int j = 0;j < 7;j++){
//                    result += number.charAt(symbol.indexOf(str.charAt(j) + ""));
//                }
//                result = result.substring(0,3) + "-" + result.substring(3,7);
//                if(!list.contains(result)){
//                    list.add(result);
//                }
//            }
//            Collections.sort(list);
//            for(int j = 0;j < list.size();j++){
//                System.out.println(list.get(j));
//            }
//            System.out.println();
//      }
        List<String> list = new ArrayList();
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String[] str = new String[n];
            for(int i = 0;i < n;i++){
                str[i] = str[i].replace("-","");
                String S = "";
                for(int j = 0;j < 7;j++){
                    S += number.charAt(symbol.indexOf(str[i].charAt(j)));
                }
                S += S.substring(0,3) + "-" + S.substring(3,7);
                if(!list.contains(S)) {
                    list.add(S);
                }
                Collections.sort(list);
                for(int j = 0;j < list.size();j++){
                System.out.println(list.get(j));
            }
            System.out.println();

            }
        }
    }
}
