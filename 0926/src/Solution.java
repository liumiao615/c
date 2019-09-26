import java.util.Arrays;

//快排
public class Solution {
    public static void quickSort(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int pivotIndex=partition(array,left,right);
        quickSort(array,left,pivotIndex-1);
        quickSort(array,pivotIndex+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j && pivot<=array[j]){
                j--;
            }
            while (i<j && pivot>=array[i]){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,left,i);
        return i;
    }
    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    //挖坑法
    public static int partition2(int[] array,int left,int right){
        int i = left;
        int j = right;
        int pivot = array[left];
        while(i<j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] <= pivot) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }
    //定义两个值前后遍历
    public static int partition3(int[] array,int left,int right){
        int d=left+1;
        int pivot=array[left];
        for(int i=0;i<right;i++){
            if(array[i]<pivot){
                swap(array,i,d);
                d++;
            }
        }
        swap(array,d-1,left);
        return d-1;
    }

    public static void main(String[] args) {
        int []a = {2,3,5,7,9,4,5,6,9,1,4,7,8};
      //  System.out.println(quickSort(a,2,8));
        System.out.println(partition(a,2,8));
        System.out.println(partition2(a,2,8));
        System.out.println(partition3(a,2,8));
    }
}
