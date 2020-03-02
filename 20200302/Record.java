import java.util.Arrays;
import java.util.Scanner;

public class Record {
    public static double Score(int[] nums1,double[] nums2){
        for(int i = 0;i < nums2.length;i++){
            if(nums2[i] >= 90 && nums2[i] <= 100){
                nums2[i] = 4.0;
            }else if(nums2[i] >= 85 && nums2[i] <= 89){
                nums2[i] = 3.7;
            }else if(nums2[i] >= 82 && nums2[i] <= 84){
                nums2[i] = 3.3;
            }else if(nums2[i] >= 78 && nums2[i] <= 81){
                nums2[i] = 3.0;
            }else if(nums2[i] >= 75 && nums2[i] <= 77){
                nums2[i] = 2.7;
            }else if(nums2[i] >= 72 && nums2[i] <= 74){
                nums2[i] = 2.3;
            }else if(nums2[i] >= 68 && nums2[i] <= 71){
                nums2[i] = 2.0;
            }else if(nums2[i] >= 64 && nums2[i] <= 67){
                nums2[i] = 1.5;
            }else if(nums2[i] >= 60 && nums2[i] <= 63){
                nums2[i] = 1.0;
            }else {
                nums2[i] = 0;
            }
        }
        int count = 0;
        double score = 0;
        for(int j = 0;j < nums1.length;j++){
            count += nums1[j];
            score += (nums1[j] * nums2[j]);
        }
        return score/count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] coursecredit = new int[number];
        for(int i = 0;i < number;i++){
            coursecredit[i] = scanner.nextInt();
        }
        double[] credit = new double[number];
        for(int j = 0;j < number;j++){
            credit[j] = scanner.nextInt();
        }
//        int i = 0;
//        int j = 0;
//        while(scanner.hasNext()){
//            if(i < number){
//                coursecredit[i++] = scanner.nextInt();
//            }else {
//                credit[j++] = scanner.nextInt();
//            }
//
//        }
        double A = Score(coursecredit,credit);
        System.out.printf("%.2f",A);
    }
}
