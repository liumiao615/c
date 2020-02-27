import java.util.Arrays;

public class Text {
    public static int[] twoSum(int[] nums,int target){
        int[] arr = new int[2];
        int A = 0;
        for(int i = 0;i < nums.length ;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[A++] = i;
                    arr[A++] = j;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
