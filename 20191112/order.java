public class order {
    public static void quitSort(int[] array){
        quickSortInter(array,0,array.length - 1);
    }

    private static void quickSortInter(int[] a, int left, int right) {
        if(left >= right){
            return;
        }
       int pivotIndex =  partition1(a,left,right);
       quickSortInter(a,left,pivotIndex - 1);
       quickSortInter(a,pivotIndex + 1,right);
    }
    //挖坑法
//    public static int partition2(int[] a,int left,int right){
//        int begin = left;
//        int end = right;
//        int pivot = a[left];
//        while(begin < end){
//            while(begin < end && a[end] >= pivot){
//                end--;
//            }
//            a[begin] = a[end];
//            while(begin < end && a[begin] <= pivot){
//                begin++;
//            }
//            a[end] = a[begin];
//        }
//        a[begin] = pivot;
//        return begin;
//    }
   //swap
    public static int partition1(int[] a,int left,int right){
        int begin = left;
        int end = right;
        int pivot = a[left];
        //[left,begin)    <= p;
        //end,right]      >=p;
        while(begin < end){
            while (begin < end&&a[end] >= pivot){
                end--;
            }
            while(begin < end&&a[left] <= pivot){
                begin++;
            }
            swap(a,end,begin);
        }
        swap(a,left,begin);
        return begin;
    }
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
//    public static int partition3(int[] a,int left,int right){
//        int pivot = a[left];
//        int d= left +1;
//        for(int i = left + 1;i <= right;i++){
//            if(a[i] < pivot){
//
//            }
//        }
//    }


}
