import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String S = scanner.next();
            char[] arr = S.toCharArray();
            if(arr.length <= 8 || S == null){
                System.out.println("NG");
            }
            for(int m = 0;m < S.length() - 2;m++){
                String sub = S.substring(m,m+3);
                if(S.substring(m + 1).contains(sub)) {
                    System.out.println("NG");
                }
            }
            int i = 0;
            int j = 0;
            int k = 0;
            int h = 0;
            for(int n = 0;n < arr.length;n++){
                if(arr[n] >= '0' && arr[n] <= '9'){
                    i = 1;
                    continue;
                }else if(arr[n] >= 'A' && arr[n] <= 'Z'){
                    j = 1;
                    continue;
                }else if(arr[n] >= 'a' && arr[n] <= 'z'){
                    k = 1;
                    continue;
                }else {
                    h = 1;
                    continue;
                }
            }
            if(i + j + k + h <= 3){
                System.out.println("NG");
            } else {
                System.out.println("OK");
            }
        }
    }
}


