import java.util.Arrays;

public class Solution {
    //归并排序
    public static  void mergeSort(int[] array){
        mergeSortInter(array,0, array.length);
    }

    private static void mergeSortInter(int[] array, int low, int hight){
        if(low >= hight - 1){
            return;
        }
        int mid = (low + hight)/2;
        mergeSortInter(array,low,mid);
        mergeSortInter(array,mid,hight);
        merge(array,low,mid,hight);
    }

    private static void merge(int[] array, int low, int mid, int hight) {
        int length = hight - low;
        int[] b = new int[length];
        int i = low;
        int j = mid;
        int k = 0;
        while(i < mid && j < hight){
            if(array[i] > array[j]){
                b[k++] = array[j++];
            }else {
                b[k++] = array[i++];
            }

        }
        while (i < mid){
            b[k++] = array[i++];
        }
        while (j < hight){
            b[k++] = array[j++];
        }
        for (int a = 0;a < length;a++){
            array[low++] = b[a];
        }
    }
    //非递归 归并
    public static void mergeSort2(int[] array){
        for(int i = 1;i < array.length;i = i*2){
            for(int j = 0;j < array.length;j = j+2*i){
                int low = j;
                int mid = j + i;
                if (mid >= array.length) {
                    continue;
                }
                int high = mid + i;
                if (high > array.length) {
                    high = array.length;
                }

                merge(array, low, mid, high);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
