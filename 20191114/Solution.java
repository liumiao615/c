import java.util.Scanner;

public class Solution {
    public static int minmul(int A,int B){
        int result = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        if(A == 0 || B == 0){
            return 0;
        }
        for(int i = 2;i > 0;i += 2){
            if(A%i == 0 && B % i == 0){
                a = i;
            }
            if(!(A % i == 0) || !(B % i == 0)){
                break;
            }
        }
        for(int j = 3;j > 0;j *= 2){
            if(A%j == 0 && B % j == 0){
                b = j ;
            }
            if(!(A % j == 0) || !(B % j == 0)){
                break;
            }
        }
        for(int i = 5;i > 0;i *= 2){
            if(A%i == 0 && B % i == 0){
                c = i;
            }
            if(!(A % i == 0) || !(B % i == 0)){
                break;
            }
        }
        for(int i = 7;i > 0;i *= 2){
            if(A%i == 0 && B % i == 0){
                d = i;
            }
            if(!(A % i == 0) || !(B % i == 0)){
                break;
            }
        }
        if(a != 1 || b!= 1 || c!= 1|| d !=1){
            return a*b*c*d;
        }else {
            return A*B;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(minmul(A,B));
        }
    }
}
