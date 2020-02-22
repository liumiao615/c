import java.util.Arrays;

public class Compare {
    public static int[] compare(int[] A){
        for(int i = 0;i < A.length;i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(compare(A)));
    }
}
