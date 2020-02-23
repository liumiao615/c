import java.util.Arrays;

public class Insert {

    public static void InsertSortGap(int[] Array,int gap){
        for(int i = 0;i < Array.length;i++){
            int v = Array[i];
            int j = i - gap;
            for(;j >= 0 && Array[j] > v;j-=gap){
                Array[j + gap] = Array[j];
            }
            Array[j + gap] = v;
        }
    }
    //希尔排序
    public static void shellSort(int[] arr){
        int gap = arr.length;
        while(gap > 1){
            InsertSortGap(arr,gap);
            gap = gap / 3 + 1;
        }
        InsertSortGap(arr,1);
    }
    //插入排序
    public static void Insert(int[] arr) {
        for(int i = 0;i < arr.length;i++){
            int A = arr[i];
            int j = i-1;
            for(;j >= 0 && arr[j] > A;j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = A;
        }
    }
    //选择排序
    public static void selectSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            int max = 0;
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            int t = arr[max];
            arr[max] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            boolean issort = true;
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j + 1]){
                    Swap(arr,j,j + 1);
                    issort = false;
                }
            }
            if(issort){
                break;
            }
        }
    }
    //快速排序
    public static void quickSort(int[] arr){
        quicksortInt(arr,0,arr.length - 1);
    }

    private static void quicksortInt(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
        int pivotIndex = partition(arr,left,right);
        quicksortInt(arr,left,pivotIndex - 1);
        quicksortInt(arr,pivotIndex + 1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[left];
        while(i < j){
            while(i < j && arr[j] >= pivot){
                j--;
            }
            while (i < j && arr[i] <= pivot){
                i++;
            }
            Swap(arr,i,j);
        }
        Swap(arr,i,left);
        return i;
    }

    private static void Swap(int[] arr, int j, int i) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    //二分查找
    public static int BrinarySearch(int []arr,int number){
        int result = Binary(arr,0,arr.length,number);
        return result;
    }

    private static int Binary(int[] arr, int low,int high,int number) {
        while(high > low){
            int mid = (low + high)/2;
            if(arr[mid] == number){
                return mid;
            }else if(arr[mid] > number){
                return Binary(arr,low,mid,number);
            }else {
                return Binary(arr,mid,high,number);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] ARRAY = {1,3,9};
        int []arr = {1,56,4,7,34,23,7,67,98,97,47};
        //shellSort(arr);
        //Insert(arr);
        //selectSort(arr);
        //bubbleSort(arr);
        //quickSort(arr);
        //plusOne(ARRAY);
        //System.out.println(Arrays.toString(arr));
        System.out.println(BrinarySearch(arr,67));
    }
}
