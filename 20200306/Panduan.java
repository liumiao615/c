import java.util.Scanner;
public class Panduan{
    public static void P(int num){
        int num1 = num;
        int num2 = num * num;
        int i = 0;

        while(num1 / 10 != 0){
            i++;
            num1 = num1 / 10;
        }
        int count = (int) Math.pow(10,i+1);
        if(num2 % count == num){
            System.out.println("Yes !");
        }else{
            System.out.println("No !");
        }
    }
    public static void main(String []args){
        Scanner  sca = new Scanner(System.in);
        int num = sca.nextInt();
        P(num);
    }
}