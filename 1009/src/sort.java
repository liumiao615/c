import java.util.Arrays;

public class sort {
    public static void mergeSort(int[] array){
        mergeSortInter(array,0,array.length);
    }

    private static void mergeSortInter(int[] array, int low, int high) {
        if(low >= high - 1){
            return;
        }
        int mid = (low + high)/2;
        mergeSortInter(array,low,mid);
        mergeSortInter(array,mid,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int length = high - low;
        int[] b = new int[length];
        int i = low;
        int j = mid;
        int k = 0;
        while(i < mid && j < high){
            if(array[i] > array[j]){
                b[k++] = array[j++];
            }else {
                b[k++] = array[i++];
            }
        }
        while(i < mid){
            b[k++] = array[i++];
        }
        while (j < high){
            b[k++] = array[j++];
        }
        for(int a = 0;a < length;a++){
            array[low++] = b[a];
        }
    }
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
