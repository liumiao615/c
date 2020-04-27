public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        int ret = 1;
        for(int i = 2;i <= target;i++){
            ret *= 2;
        }
        return ret;
    }
}