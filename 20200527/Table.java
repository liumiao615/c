package L0527;
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] Arr = new int[n];
        int[][] num = new int[m][2];
        for(int j = 0;j < n;j++){
            Arr[j] = scanner.nextInt();
        }
        for(int i = 0;i < m;i++){
            num[i][0] = scanner.nextInt();
            num[i][1] = scanner.nextInt();
        }
        Arrays.sort(Arr);
        int Z = 0;
        int[] B = new int[n];

        for(int i = 0;i < n;i++){
            int max = 0;
            for(int j = 0;j < m;j++){
                if(num[j][0] < Arr[i]){
                    max = num[j][1];
                }
            }
            B[Z++] = max;
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            B[i] += sum;
        }
        System.out.println(sum);
    }
}
