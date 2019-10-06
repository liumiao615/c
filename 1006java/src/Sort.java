import java.util.Arrays;

public class Sort {
    //选择
       public static void insert(int[] array){
           for(int i = 1;i < array.length;i++){
           int min = array[i];
           int j;
           for(j = i-1;j >= 0;j--){
           if(array[j] > min){
              array[j + 1] = array[j];
           }else{
               break;
               }
           }
            array[j + 1] = min;
        }
    }
    //折半
    public static void bsInsertSort(int[] array){
           for(int i = 1;i < array.length;i++){
               int v = array[i];
               int left = 0;
               int right = i;
               while(left < right){
                   int mid = (left + right)/2;
                   if(v >= array[mid]){
                       left = mid + 1;
                   }else {
                       right = mid;
                   }
               }
               for(int j = i;j > left;j--){
                   array[j] = array[j - 1];
               }
               array[left] = v;
           }
    }
    //希尔
    public static void shellSort(int[] array){
           int gap = array.length;
           while(gap > 1){
               gap = gap / 3 + 1;
               insertSortGap(array,gap);
               if(gap == 1){
                   break;
               }
           }
    }
    private static void insertSortGap(int[] array, int gap) {
        for(int i = gap;i < array.length;i++){
            int v = array[i];
            int j = i-gap;
            for(;j >= 0 && array[j] > v;j-=gap){
                array[j+gap] = array[j];
            }
            array[j + gap] = v;
        }
    }

    //选择
    public static void selectSort1(int[] array){
           //每次选最小的放到无序区间的最前面
           for(int i = 0;i < array.length;i++) {
               //有序：[0,i)
               //无序：[i,array.length)
               int min = i;
               for (int j = i; j < array.length; j++) {
                   if (array[min] > array[j]) {
                       Swap(array, min, j);
                   } else {
                       continue;
                   }
               }
           }
    }
    public static void selectSort2(int[] array){
           //每次选最大的放到无序区间的最后
        for(int i =  0;i < array.length - 1;i++){
            int max = 0;
            for(int j = 1;j < array.length - i;j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            Swap(array,max,array.length-1-i);
        }
    }

    private static void Swap(int[] array, int i, int j) {
           int t = array[i];
           array[i] = array[j];
           array[j] = t;
    }

    public static void main(String[] args) {
        int []a = {9,8,7,6,5,4,3,2,1,0};
        //insert(a);
        //bsInsertSort(a);
        //shellSort(a);
        selectSort2(a);
        System.out.println(Arrays.toString(a));
    }
}
