
import java.util.Scanner;

public class Consum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(m == 0 || n == 0){
            return;
        }
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = i+1;
        }

        for(int j = 0;j < n;j++){
            int count = m - arr[j];
            if((count <= n)&&(arr[j] < count)){
                System.out.println(arr[j] + " " + count);
            }
            if((j == n - 1) && m == n){
                System.out.println(n);
            }
        }
    }
}
