import java.util.Scanner;

public class MaxCount {
    public static int MaxCount1(int[] arr){
        int count = 0;
        int max = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i] < 0){
                if(count > max){
                    max = count;
                }
                count = 0;
                continue;
            }else{
                count += arr[i];
            }
        }
        if(max > count){
            return max;
        }else {
            return count;
        }
    }
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        while(sca.hasNext()){
            for(int i = 0; i < arr.length;i++){
                arr[i] = sca.nextInt();
            }
        }
        System.out.println(MaxCount1(arr));
    }
}
