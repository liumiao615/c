package J0726;

public class MinNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        for(int i = 0;i < array.length - 1;i++){
            if(array[i] > array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
    //基于二分查找来找
    public static int minNumberInRotateArray2(int [] array) {
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while(left < right){
            if(right - left == 1){
                mid = right;
                break;
            }
            mid = (left + right)/2;
            if(array[mid] == array[left] && array[left] == array[right]){
                int value = array[left];
                for(int i = left + 1 ;i < right;i++){
                    if(array[i] < value){
                        value = array[i];
                    }
                }
                return value;
            }
            if(array[mid] >= array[left]){
                left = mid;
            }
            else {
                right = mid;
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         System.out.println(minNumberInRotateArray(arr));
    }
}
