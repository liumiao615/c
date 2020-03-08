import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class QrderBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            BigInteger[] arr = new BigInteger[n];
            //long[] arr = new long[n];
            for(int i = 0;i < n;i++){
                arr[i] = scanner.nextBigInteger();
            }
            Arrays.sort(arr);
            for(int i = 0;i < n;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
