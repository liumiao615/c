import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] nums2 = nums.clone();
        int[] nums1 = Contact(nums, nums2, len);
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums1[i + k];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static int[] Contact(int[] A, int[] B, int k) {
        int[] nums1 = new int[2 * k];
        for (int i = 0; i < k; i++) {
            if (i < A.length) {
                nums1[i] = A[i];
            } else {
                nums1[i] = B[i];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int[] nums2 = nums.clone();
        int k = 3;
//        int[] rotate2 = new int[nums.length];
        rotate3(nums, k);
//        System.out.println(Arrays.toString(rotate2));
//        System.out.println(Arrays.toString(rotate(nums,k)));
//        int[] nums1 = Contact(nums,nums2,k);
//        System.out.println(nums1.toString());
        //Contact(nums,nums2,k);
        //Arrays.copyOfRange(nums1,0,nums1.length);
        //System.out.println(Arrays.copyOfRange(nums1,0,nums1.length));
        //rotate(nums,k);
    }

    public static void rotate1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int prev = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate2(int[] nums, int k){
        int[] nums1 = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            nums1[(i + k) % nums.length] = nums[i];
        }
        for(int i = 0; i < nums1.length;i++){
            nums[i] = nums1[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate3(int[] nums, int k){
        k = k % nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k -1);
        reverse(nums,k,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums,int A,int B){
//        if(A < B) {
//            for (int i = A; i < B / 2 ; i++) {
//                int fron = nums[i];
//                nums[i] = nums[B - i];
//                nums[B - i] = fron;
//            }
//        }
//错误原因：当k = 3时，循环相当于没跑
        while(A < B){
            int fron = nums[A];
            nums[A] = nums[B];
            nums[B] = fron;
            A++;
            B--;
        }
    }
}
