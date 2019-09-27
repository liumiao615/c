import java.util.Arrays;
import java.util.Random;

public class Solution {
    //插入排序
    public static void insertSort(int[] array){
        //有序[0,i)
        //无序[i,array.length-1]
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=0;
            for(j = i-1;j>=0;j--){
                if(key>=array[j]){
                    break;
                }else {
                    array[j+1]=array[j];
                }
            }
            array[j+1] = key;
        }
    }
    //希尔排序
    public static void shellSort(int[] array){
        int gap=array.length;
        while(true){
            gap = (gap/3+1);
            insertSortWithGap(array,gap);
            if(gap == 1)
                break;
        }

    }
    private static void insertSortWithGap(int[] array, int gap) {
        for(int i = gap;i <array.length;i++){
            int key=array[i];
            int j;
            for (j = i-gap;j >= 0;j--){
                if(key >= array[j]){
                    break;
                }
                else {
                    array[j+gap]=array[j];
                }
                array[j+gap] = key;
            }
        }
    }
    //选择排序
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            int key = array[i];
            for(int j = i+1;j <= array.length-1;j++){
                if(array[j] >= key){
                    j++;
                }else {
                    swap(array,j,key);
                }
            }
        }
    }

    private static void swap(int[] array, int j, int key) {
        int t = array[j];
        array[j] = key;
        key = t;
    }

    //堆排序
    public static void heapSort(int[] array){

    }
    //测速
    public static void testSpeed(){
        Random random = new Random(20190927);
        int[] a=new int[10*10000];
        for (int i = 0;i < 10*10000;i++){
            a[i] = random.nextInt(10 * 10000);
        }
        long begin = System.nanoTime();
        insertSort(a);
        long end=System.nanoTime();

        double ms=(end-begin)*1.0/1000/1000;
        System.out.printf("一共耗时：%.5f毫秒%n",ms);
    }
    public static void main(String[] args) {
       int[] a = {8,2,7,6,1};
//        insertSort(a);
//        int[] b=a.clone();
//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
//        shellSort(a);
//        System.out.println(Arrays.toString(a));
//        testSpeed();
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
