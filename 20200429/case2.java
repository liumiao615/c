package why;

import java.sql.SQLOutput;
import java.util.Scanner;

//计算斐波那契数
public class case2 {
    static class FibThread extends Thread{
        int n;
        FibThread(int n) {
            this.n = n;
        }
        @Override
        public void run() {
            System.out.printf("fib(%d) = %d%n",n,fib(n));
        }
    }
    static long fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("要计算的值：");
            int n = scanner.nextInt();
            //System.out.printf("fib(%d) = %d%n",n,fib(n));
            scanner.nextLine();
            new FibThread(n).start();
            //创建一个新线程。
            //站在主线程角度，从scanner中读取n，创建线程
            //由FibThread这个线程去计算fib(n);
        }
    }
}
