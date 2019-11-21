
import java.util.Scanner;

public class GetSeque {
    private static String GetSequeOddNum(int m) {
        int[] A = new int[10000];
        for(int i = 0;i < A.length;i++){
            A[i] = 2 * i + 1;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(GetSequeOddNum(A));
    }
}
