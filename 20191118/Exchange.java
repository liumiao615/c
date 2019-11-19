import java.util.Arrays;
import java.util.Stack;


public class Exchange {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        int[] B = new int[AB.length];
        Stack stack = new Stack();
        stack.push(AB[0]);
        stack.push(AB[1]);
        B[0] = (int) stack.pop();
        B[1] = (int) stack.pop();
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = exchangeAB(A);
        System.out.println(Arrays.toString(B));
    }
}
