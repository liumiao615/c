import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void Swap(int []array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
    //建堆
    public static void shiftDownSmall(int[] array,int index,int size){
        int left = 2*index + 1;
        while(left < size){
            int min = left;
            int right = left + 1;
            if(right<size){
                if(array[left] > array[right]){
                    min = right;
                }
            }
            if(array[index] <= array[min]){
                break;
            }
            Swap(array,min,index);
            index = min;
            left = 2*index + 1;
        }
    }
    public static void shiftDownBig(int[] array,int index,int size){
        int left = 2 * index + 1;
        while(left < size){
            int max = left;
            int right = left + 1;
            if(right < size){
                if(array[right] > array[left]){
                    max = right;
                }
            }
            if(array[index] > array[left]){
                break;
            }
            Swap(array,max, index);
            index = max;
            left = 2 * index + 1;
        }
    }
    public static void createHeap(int[] array,int size){
        for(int i =( size - 1 ) / 2;i >= 0;i--){
            //shiftDownBig(array,i,size);
            shiftDownSmall(array,i,size);
        }
    }

    //操作：入队列
    public static void shiftup(int[] array,int index){
        while(index > 0){
            int parent = (index - 1)/2;
            if(array[parent] >= array[index]){
                break;
            }
            Swap(array,index,parent);
            index = parent;
        }
    }
    public static void heapSort(int[] array){
        createHeap(array,array.length);
        for(int i = 0;i < array.length-1;i++){
            Swap(array,0,array.length-1-i);
            shiftDownSmall(array,0,array.length-1-i);
        }
    }
    public static void main(String[] args) {
        int[] a={8,7,6,5,7,3};
        createHeap(a,a.length);
        System.out.println(Arrays.toString(a));
//        shiftup(a,6);
        int[] b={8,7,6,5,7,3};
        heapSort(b);
        System.out.println(Arrays.toString(b));
        //随机数做堆
//        int[] a=new int[10];
//        Random random = new Random(20191004);
//        for(int i =  0;i < 10; i++){
//            a[i] = random.nextInt(20);
//        }
//        System.out.println(Arrays.toString(a));
//        createHeap(a,a.length);
//        System.out.println(Arrays.toString(a));

    }
}
