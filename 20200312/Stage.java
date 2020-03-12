import java.util.Scanner;

public class Stage {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = {1,2,4};
        if(n <= 0){
            System.out.println("0");
        }else if( n <= 3){
            System.out.println(arr[n - 1]);
        }else {
            for(int i = 4;i <= n;i++){
                int count = ((arr[0] + arr[1]) % 1000000007+ arr[2]) % 1000000007;
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = count;
            }
        }
        System.out.println(arr[2]);
    }
}
