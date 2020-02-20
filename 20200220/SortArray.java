import java.util.Arrays;
import java.util.Stack;

public class SortArray {
    public static int[] sortArrayByParity(int[] A){
        Stack stack1 = new Stack();
        for(int i = 0; i< A.length;i++){
            if (A[i] % 2 == 1){
                stack1.push(A[i]);
            }
        }
        for(int i = 0; i< A.length;i++){
            if (!(A[i] % 2 == 1)){
                stack1.push(A[i]);
            }
        }
        for(int i = 0;i < A.length;i++){
            A[i] = (int) stack1.pop();
        }
        return A;
    }
    public static int[] sortArrayByParity2(int[] A){
        int t = 0;
        int w = A.length - 1;
        int[] Arr = new int[A.length];
        for(int i = 0;i < A.length;i++) {
            if (A[i] % 2 == 0) {
                Arr[t++] = A[i];
            } else {
                Arr[w--] = A[i];
            }
        }
        return Arr;
    }

        public static void main(String[] args) {
        int []A = {3,1,2,4};
            System.out.println(Arrays.toString(sortArrayByParity(A)));
            System.out.println(Arrays.toString(sortArrayByParity2(A)));
    }
}
