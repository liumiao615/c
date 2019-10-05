import java.util.Arrays;

public class aaa {
    public static void Swap(int []array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
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
    public static void createHeap(int[] array,int size){
        for(int i =( size - 1 ) / 2;i >= 0;i--){
            shiftDownSmall(array,i,size);
        }
    }




//    public static void shiftUpSmall(int[] array, int i) {
//        // 直到 i == 0 之前，一直
//        // 先找到 i 的双亲的下标
//        // 比较 array[parent] 和 array[i]
//        // 如果满足条件，调整结束
//        // 否则，交换，然后 让 i = parent 继续
//        while (i != 0) {
//            int p = (i - 1) / 2;
//            if (array[p] <= array[i]) {
//                break;
//            }
//            Swap(array, p, i);
//            i = p;
//        }
//
//    }




//    public static void Heapset(int[] a,int k){
//        int[] b = new int[a.length];
//        for(int i = 0;i < k;i++){
//            b[i]=a[i];
//        }
//        createHeap(b,k);
//        for(int i=k;i < a.length;i++){
//           if(b[0] < a[i]){
//               b[0] = a[i];
//               createHeap(b,k);
//           }
//        }
//    }



    public static void main(String[] args) {
        int[] a = {1,4,23,6,7,2,69,13,2,0,8};

        int k = 5;
        int[] b = new int[a.length];
        for(int i = 0;i < k;i++){
            b[i]=a[i];
        }
        createHeap(b,k);
        for(int i=k;i < a.length;i++){
            if(b[0] < a[i]){
                b[0] = a[i];
                createHeap(b,k);
            }
        }

        System.out.println(Arrays.toString(b));

    }
}
