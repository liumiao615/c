import java.util.ArrayList;
import java.util.Arrays;

public class sortedSquares {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList();
		if(input.length == 0 || input == null || k < 0 || input.length < k){
			return list;
		}
        for(int i = 0;i < input.length;i++){
            int A = input[i];
            int j = i - 1;
            for(;j >= 0 && input[j] > A;j--){
                  input[j + 1] = input[j];
            }
            input[j + 1] = A;
        }
        for(int i = 0;i < k;i++){
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(nums,4));
    }
}
