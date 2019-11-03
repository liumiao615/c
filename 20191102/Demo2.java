
import java.util.Scanner;
class Fibonacci {
    // O(2^n)
    public static long calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calc(n - 1) + calc(n - 2);
        }
    }
}
class MyThred extends Thread{
    private int n;
    MyThred(int n){
        this.n = n;
    }
    @Override
    public void run(){
        long result = Fibonacci.calc(n);
        System.out.printf("第 %d 项斐波那契数为：%d",n,result);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入要计算的第几项的斐波那契数：");
            int n = scanner.nextInt();
            Thread thread = new MyThred(n);
            thread.start();
        }
    }
}
