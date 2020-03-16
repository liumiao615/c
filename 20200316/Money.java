import java.util.Scanner;

public class Money {
    public static int calcu(int[] price){
        int firstBuy = Integer.MIN_VALUE,firstSell = 0;
        int SecondBuy = Integer.MIN_VALUE,SecondSell = 0;

        for(int i:price){
            firstBuy = Math.max(firstBuy,-i);
            firstSell = Math.max(firstSell,i + firstBuy);
            SecondBuy = Math.max(SecondBuy,firstSell - i);
            SecondSell = Math.max(SecondSell,SecondBuy + i);
        }
        return SecondSell;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,5,1,7,8};
        int[] arr1 = {1,2,3,4,6,5};
        System.out.println(calcu(arr) + " " + calcu(arr1));
    }
}
