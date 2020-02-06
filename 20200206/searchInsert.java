public class searchInsert {
    public int searchInsert(int[] nums,int target){
        int j = 0;
       for(int i = 0;i < nums.length;i++){
           if(nums[i] == target){
               return i;
           }else if(nums[i] < target){
               j++;
           }
       }
       return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int target = 0;
        searchInsert s = new searchInsert();
        System.out.println(s.searchInsert(nums,target));
    }
}
