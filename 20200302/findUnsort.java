import java.util.Arrays;

public class findUnsort {
    public static int findunsortedsubarray(int[] nums){
        int count = 0;
        int[] num = nums.clone();
        Arrays.sort(nums);

        for(int i = 0;i < num.length;i++){
            if(num[i] == nums[i]){
                count++;
            }else {
                break;
            }
        }
        for(int j = num.length - 1;j >= 0;j--){
            if(num[j] == nums[j]){
                count++;
            }else {
                break;
            }
        }
        if(count == 2 * (nums.length)){
            return 0;
        }else {
            return num.length - count;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findunsortedsubarray(nums));
    }
}
