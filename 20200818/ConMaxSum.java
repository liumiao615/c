package J0802;
import java.util.*;
public class ConMaxSum {
        public static int FindGreatestSumOfSubArray(int[] array) {
            int[]A = new int[array.length];
            A[0] = array[0];
            int max = A[0];
            for(int i = 1;i < array.length;i++){
                A[i] = Math.max(A[i-1]+array[i],array[i]);
                if(max < A[i]){
                    max = A[i];
                }
            }
            return max;
        }
    public static int FindGreatestSumOfSubArray1(int[] array){
            int total = array[0];
            int max = array[0];

            for(int i = 1;i < array.length;i++){
                if(total >= 0){
                    total += array[i];
                }else {
                    total = array[i];
                }

                if(max < total){
                    max = total;
                }
            }
            return max;
    }
    public static void main(String[] args) {
            int[] array={1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray1(array));
    }
}
