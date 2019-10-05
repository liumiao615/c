import java.util.Arrays;

public class shift {
    public static void Swap(int[] a,int b,int c){
        int t = a[b];
        a[b] = a[c];
        a[c] = t;
    }
    public static void shiftDown(int[] array,int size,int index){
        int left = 2*index + 1;
        while(left < size){
            int right = left + 1;
            int max = left;
            if(right < size){
                if (array[left] < array[right]){
                    max = right;
                }
            }
            if(array[index] >= array[max]){
                break;
            }
            Swap(array,index,max);
            index = max;
            left = 2 * index + 1;
        }
    }
    public static void shuff(int[] a,int size){
        for(int i =(size - 1)/2;i >= 0;i--){
            shiftDown(a,size,i);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,23,6,7,2};
        shuff(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
