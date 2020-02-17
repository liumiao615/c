import java.util.Arrays;

public class Insert {
    public static void InsertSortGap(int[] Array,int gap){
        for(int i = 0;i < Array.length;i++){
            int v = Array[i];
            int j = i - gap;
            for(;j > 0 && Array[j] > v;j--){
                Array[j + gap] = Array[j];
            }
            Array[j + gap] = v;
        }
    }
    public static void shellSort(int[] arr){
        int gap = arr.length;
        while(gap > 1){
            InsertSortGap(arr,gap);
            gap = gap / 3 + 1;
        }
        InsertSortGap(arr,1);
    }
    public static void main(String[] args) {
        int []arr = {1,56,4,7,34,23,67,98,97,47};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
