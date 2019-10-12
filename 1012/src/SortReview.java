import java.util.Arrays;

public class SortReview {
    //插排
    public static void insert(int[] array){
        for(int i = 1;i < array.length;i++){
            int min = array[i];
            int j = i -1;
            for(;j >= 0;j--){
                if(array[j] > min){
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = min;
        }
    }
    //希尔排序
    public static void shellSort(int[] array){
        int gap = (array.length);
        while(gap > 1){
            gap = gap/3 + 1;
            insertGap(array,gap);
            if(gap == 1){
                break;
            }
        }
    }
    public static void insertGap(int[] array,int gap){
        for(int i = gap;i < array.length;i++){
            int min = array[i];
            int j = i - gap;
            for(;j >= 0;j-=gap){
                if(array[j] > min){
                    array[j + gap] = array[j];
                }else {
                    break;
                }
            }
            array[j + gap] = min;
        }
    }
    //选择
    public static void Swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    public static void choose(int[] array){
        for(int i = 0;i < array.length; i++){
            int min = i;
            int j = i + 1;
            for(;j < array.length;j++){
                if(array[min] > array[j]){
                    Swap(array,min,j);
                }else {
                    continue;
                }
            }
        }
    }
    public static void choose2(int[] array){
        for(int i = array.length - 1;i >= 0;i--){
            int max = i;
            for(int j = i - 1;j>=0;j--){
                if(array[j] > array[max]){
                    Swap(array,j,max);
                }else {
                    continue;
                }
            }
        }
    }
    public static void selectsort(int[] array){
        //每次选最大的放到无序区间的最后
        for(int i = 0;i < array.length - 1;i++){
            int max = 0;
            for(int j = 1;j < array.length-i ;j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            Swap(array,max,array.length-1-i);
        }
    }
    //堆排
    public static void heapsort(int[] array){
        creatheap(array);

    }

    private static void creatheap(int[] array) {
        int left = 0;

    }

    public static void main(String[] args) {
        int[] array = {1,11,34,0,2,6,3,45};
        //insert(array);
        //shellSort(array);
        //choose(array);
        selectsort(array);
        //choose2(array);
        System.out.println(Arrays.toString(array));
    }

}
