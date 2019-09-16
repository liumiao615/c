import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           int j=i+1;
           int k= nums.length-1;
           int temp = j;
           for (;k > temp;k--){
               j = temp;
               while(j<k){
                   if (!(j<k && nums[i]+nums[j]+nums[k]==0)){
                       j++;
                   }
                   if(j>=k){
                       break;   
                   }
                   if(nums[i]+nums[j]+nums[k]==0){
                       List<Integer> list=new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[k]);
                       result.add(list);
                       while(j<k && nums[j]==nums[j+1]){
                           j++;
                       }
                       j++;
                   }
               }
           }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};


        ThreeSum threeSum = new ThreeSum();

        List<List<Integer>> lists = threeSum.threeSum(nums);
        System.out.println(lists);
    }
}
