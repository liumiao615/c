import java.util.Arrays;
import java.util.Random;
//插排
public class Sort {
    public static void insertsort(int[] array){
        for(int i=1;i<array.length;i++){
            //有序：[0,i)
            //无序：[i,array.length)
            int key=array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]<key || array[j]==key){
                    break;
                }
                else{
                    array[j+1]=array[j];
                }
            }
            array[j+1]=key;
        }
    }
    //希尔排序

    public static void shellSort(int[] array){
        int gap=array.length;
        while(true){
            gap=(gap/3+1);
            insertsortwithGap(array,gap);
            if(gap==1){
                break;
            }
        }
    }

    private static void insertsortwithGap(int[] array, int gap) {
        for(int i=gap;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-gap;j>=0&&array[j]>key;j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=key;
        }
    }
//选择排序
    public static void selectSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            // 无序 [0, array.length - i)
            // 有序 [array.length - i, array.length)
            int max=0;
            for(int j=1;j<array.length-i;j++){
                if(array[j] > array[max]){
                    max=j;
                }
                swap(array,max,array.length-1-i);
            }
        }
    }
    //堆排序
    public static void heapSort(int[] array){
        //建大堆
        createBigHeap(array);
        for (int i=0;i<array.length-1;i++){
            //无序[0,array.length-i)
            //交换[0,array.length-i-1]
            swap(array,0,array.length-1-i);
            shiftDown(array,array.length-1-i,0);
        }
    }

    private static void createBigHeap(int[] array) {

    }

    private static void shiftDown(int[] array, int size, int index) {
        int left=2*index+1;
        while(left<size){
            int max=left;
            int right=left+1;
            if(right<size){
                if (array[right]>array[max]){
                    max=right;
                }
            }
            if(array[index]>=array[max]){
                break;
            }
            swap(array,max,index);
            index=max;
            left=2*index+1;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    //

    //测速
    public static void testSpeed(){
        Random random = new Random(20190924);
        int []a = new int[10*10000];
        for (int i=0;i<10*10000;i++){
            a[i]= random.nextInt(10*10000);
        }
        long begin = System.nanoTime();
        insertsort(a);
        long end=System.nanoTime();

        double ms=(end-begin)*1.0/1000/1000;
        System.out.printf("一共耗时：%.5f毫秒%n",ms);
    }

    public static void main(String[] args) {
        int []a = {2,3,5,7,9,4,5,6,9,1,4,7,8};
        insertsort(a);
        System.out.println(Arrays.toString(a));
        int []b = a.clone();
        insertsort(b);
        System.out.println(Arrays.toString(b));
        int []c = a.clone();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.equals(b,c));
        testSpeed();
    }
}
