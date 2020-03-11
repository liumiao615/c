import java.util.Scanner;

public class countNumberOf2 {
        public static int cou(int n){
            int count  = 0;
            while(n != 0){
                if(n % 10 == 2){
                    count++;
                    n /= 10;
                }else {
                    n /= 10;
                }
            }
            return count;
        }
        public static int countNumberOf2s(int n) {
            // write code here
            int sum = 0;
            for(int i = 0;i <= n;i++){
                sum += cou(i);
            }
            return sum;
        }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int n = 23;
        System.out.println(countNumberOf2s(n));
    }
}
