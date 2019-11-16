import java.util.Scanner;

public class N {
    public static int Calculate(int n){
        int count = 0;
        for(int i = 1;i <= n;i++){
            int j = i;
            while (j % 5 == 0){
                count++;
                j /= 5;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //int n = 15;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = Calculate(n);
        System.out.println(count);
    }
}
