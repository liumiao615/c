import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String S = scanner.nextLine();
//        int count = 0;
//        Map<Character,Integer> map = new HashMap<>();
//        char[] array = S.toCharArray();
//        int length = array.length;
//        if(length == 1){
//            System.out.println("YES");
//        }
//        for(int i = 0;i < length;i++){
//            map.put(array[i],map.getOrDefault(array[i],0) + 1);
//        }
//        for(Map.Entry<Character,Integer> e:map.entrySet()){
//            if(e.getValue() == 2){
//                count++;
//            }
//        }
//        if(length / 2 == count){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String S = scanner.nextLine();
            if(panD(S.substring(0,S.length() - 1)) ||
                    (panD(S.substring(1,S.length())))){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    public static boolean panD(String S){
        return new StringBuilder(S).reverse().toString().equals(S);
    }
}
