import java.util.Scanner;

public class Main1 {
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
            A[begin] = A[end];
            while(begin < end && A[begin]<= middle){
                begin++;
            }
            A[end] = A[begin];

        }
        A[begin] = middle;
        return begin;
    }
    public static void Find(int[] B,int K){
        for(int i = 0;i<K;i++){
            System.out.print(B[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //接收字符串
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] B = new int[s.length-1];
            int k = Integer.parseInt(s[s.length-1]);
            for(int i=0;i<s.length-1;i++){
                B[i] = Integer.parseInt(s[i]);
            }
            quickorder(B,B.length);
            Find(B,k);
        }
    }
}

