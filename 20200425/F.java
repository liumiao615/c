import java.util.*;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int []arr = new int[array.length];
        arr[0] = array[0];
        for(int i = 1;i < array.length;i++){
            arr[i] = Math.max(arr[i-1] + array[i],array[i]);
        }
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}