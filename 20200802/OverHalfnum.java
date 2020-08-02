package J0802;

import java.util.Arrays;
import java.util.Scanner;

public class OverHalfnum {
    public static int Con(int[] arr,int num){
        Arrays.sort(arr);
        int number = arr[num/2];
        int count = 0;
        for(int i = 0;i < num;i++){
            if(arr[i] == number){
                count+=1;
            }
        }
        if(count > num/2){
            return number;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i < num;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Con(arr,num));
    }
}
