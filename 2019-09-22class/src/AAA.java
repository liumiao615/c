import java.util.Arrays;

public class AAA {
    public static void shiftDown(int []array,int index,int size){
        int left=2*index+1;
        int min=left;
        while(left<size){
            int right=left+1;
            if (array[left] > array[right]) {
                min=right;
            }
            if(array[index]>array[min]){
                int t=array[index];
                array[index]=array[min];
                array[min]=t;
            }
            else{
                break;
            }
            index=min;
            left=2*index+1;
        }
    }
    public static void shiftDownBig(int []array,int index,int size){
        int left=2*index+1;
        int max=left;
        while(left<size){
            int right=left+1;
            if(array[left]<array[right]){
                max=right;
            }
            if(array[index]<array[max]){
                int t=array[index];
                array[index]=array[max];
                array[max]=t;
            }else {
                break;
            }
            index=max;
        }
    }

    public static void main(String[] args) {
        int[]a={39,15,38,45,6,51,52,70};
        shiftDown(a,0,a.length);
        System.out.println(Arrays.toString(a));
        int[]b={100,50,30,25,40,70,70,10,5,20,80,60,30,60,70,5};
        shiftDownBig(b,0,b.length);
        System.out.println(Arrays.toString(b));
    }
}
