//import java.util.Scanner;
//public class FindX {
//    public static int pri(int m,int[] arr,int n){
//        for(int j = 0;j < n;j++){
//            if(arr[j] == m){
//                return j;
//            }else{
//                continue;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0;i < n;i++){
//
//            arr[i] = scanner.nextInt();
//        }
//        int m = scanner.nextInt();
//        //int m = Scanner.nextInt();
//        System.out.println(pri(m,arr,n));
//    }
//}
import java.util.Scanner;
public class FindX{
    public static int pri(int m,int[] arr,int n){
        for(int j = 0;j < n;j++){
            if(arr[j] == m){
                return j;
            }else{
                continue;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        System.out.println(pri(m,arr,n));
    }
}