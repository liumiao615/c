package J0726;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int first = 1;
        int second = 1;
        int count = 0;
        while(n > 2){
            count = first + second;
            first = second;
            second = count;
            n--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
