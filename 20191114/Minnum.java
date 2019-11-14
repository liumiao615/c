import java.util.Arrays;
import java.util.Scanner;

public class Minnum {
    public static void quickorder(int[] A,int n){

        Inorder(A,0,n -1);
    }
    public static void Inorder(int[] A,int left,int right){
        if(left >= right){
            return;
        }
        int pivotIndex = order(A,left,right);
        Inorder(A,left,pivotIndex - 1);
        Inorder(A,pivotIndex + 1,right);
    }
    public static int  order(int[] A,int left,int right){
        int begin = left;
        int end = right;
        int middle = A[left];
        while(begin < end){
            while(begin < end && A[end] >= middle){
                end--;
            }

            while(begin < end && A[begin]<= middle){
                begin++;
            }
            swap(A,begin,end);
        }
        swap(A,begin,left);
        return begin;
    }
    private static void swap(int[] A,int left, int right) {
        int t = A[left];
        A[left] = right;
        A[right] = t;
    }
    public static void Find(int[] B,int K){
        for(int i = 0;i<B.length;i++){
            while (i <= K) {
                System.out.print(B[i] + " ");
                i++;
            }
            break;
        }
    }
    public static void main(String[] args) {
//        int[] a ={3,9,6,8,7,1,30,12,23,5,-1,-2};
        int k = 6;
        int[] B = new int[100];
//        quickorder(a,a.length);
//        //Systm.out.println(Arrays.toString(a));
//        Find(a,k);
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            for(int i = 0; i < B.length;i++){
                B[i] = sc.nextInt();
            }
        }
        quickorder(B,B.length);
        Find(B,k);
    }
}
