public class ContainsDuble {
    public static boolean containDouble(int[] nums){
        for(int i = 0;i < nums.length;i++){
            int A = nums[i];
            for(int j = i + 1;j < nums.length;j++){
                if(A == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4};
        System.out.println(containDouble(nums));
    }
}
