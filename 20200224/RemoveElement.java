import java.util.Arrays;
import java.util.Stack;

public class RemoveElement {
    public static int removeElement(int[] nums,int val){
        int num = 0;
//        Stack stack = new Stack();
//        for(int A:nums){
//            if(A == val){
//                num++;
//            }else {
//                stack.push(A);
//            }
//        }
//        for(int i = 0; i < nums.length;i++){
//            nums[i] = (int) stack.pop();
//        }
//        System.out.println(stack);
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[num] = nums[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return num;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
