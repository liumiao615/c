//根据排序的思路，找出数组中第K大的数
public class Finder {
    public int findKth(int[] a, int n, int K){
        if(K <=0 || K > n){
            return 0;
        }
        quitSort(a,0,n);
        int b = a[n - K];
        return b;
    }

    private void quitSort(int[] a, int left, int right) {
        if(left > right){
            return ;
        }
        int pivotIndex = partition(a,left,right);
        quitSort(a,left,pivotIndex - 1);
        quitSort(a,pivotIndex + 1,right);

    }

    private int partition(int[] a, int left, int right) {
        int begin = left;
        int end = right;
        int pivot = a[left];
        while(begin < end){
            while(begin < end && a[end] >= pivot){
                end--;
            }
            a[begin] = a[end];
            while(begin < end && a[begin] <= pivot){
                begin++;
            }
            a[end] = a[begin];
        }
        a[begin] = pivot;
        return begin;
    }
}
