package J0728;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int single = 0;
        int dou = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 1 ){
                queue1.offer(array[i]);
                single++;
            }else{
                queue2.offer(array[i]);
                dou++;
            }
        }
        for(int i = 0;i < single;i++){
            array[i] = queue1.poll();
        }
        for(int i = single;i < array.length;i++){
            array[i] = queue2.poll();
        }
    }

    public static void reOrderArray2(int [] array) {
        int value = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 1){
                int temp = array[i];
                int j = i;
                while(j > value){
                    array[j] = array[j - 1];
                    j--;
                }
                array[value++] = temp;
            }
        }
    }
        public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,2};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
