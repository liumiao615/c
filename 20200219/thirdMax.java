import java.util.Arrays;
import java.util.Stack;

public class thirdMax  {
    Stack<Integer> stack = new Stack<>();
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int A = 0;
        int thirdmax = nums[nums.length - 1];
        for(int i = nums.length - 2;i >= 0;i--){
            if(nums[i] > thirdmax){
				nums[i] = thridmax;
            }
        }
        return thirdmax;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        //thirdMax(nums);
        System.out.println(thirdMax(nums));
    }
}
