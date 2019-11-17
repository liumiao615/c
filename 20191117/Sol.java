import java.util.Arrays;

public class Sol {
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i = 1;i < B.length;i++){
            B[0] = 1;
            B[i] = B[i - 1] * A[i - 1];
        }
        for (int i = B.length - 2;i >= 0;i--){
            B[i] = B[i + 1] / A[i] * A[i + 1];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = multiply(A);
        System.out.println(Arrays.toString(B));
    }
}
