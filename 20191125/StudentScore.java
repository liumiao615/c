import java.util.Scanner;

public class StudentScore {
    public static int Find(int A,int[] B, int C){
        int count = 0;
        for(int i = 0;i < A;i++){
            if(B[i] == C){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int A = scanner.nextInt();
            if (A == 0){
                return;
            }
            int[] B = new int[A];
            for(int i = 0;i < A;i++){
                B[i] = scanner.nextInt();
            }
            int C = scanner.nextInt();
            int D = Find(A,B,C);
            System.out.println(D);
        }
    }
}
