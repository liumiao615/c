import java.util.Scanner;

public class Devide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i = 0;i < N;i++){
            A[i] = scanner.nextInt();
        }
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int A4 = 0;
        int A5 = 0;
        int f2 = 1;
        int f4 = 0;

        for(int i = 0;i < N;i++){
            if(A[i] % 5 == 0){
                if(A[i] % 2 == 0){
                    A1 += A[i];
                }
            }

            if(A[i] % 5 == 1){
                A2 += f2 * A[i];
                f2 = -f2;
            }

            if(A[i] % 5 == 2){
                A3++;
            }

            if(A[i] % 5 == 3){
                A4 += A[i];
                f4++;
            }

            if(A[i] % 5 == 4){
                if(A[i] > A5){
                    A5 = A[i];
                }
            }
        }
        if (A1 != 0) {
            System.out.print(A1 + " ");
        } else {
            System.out.print('N' + " ");
        }
        if (A2 != 0) {
            System.out.print(A2 + " ");
        } else {
            System.out.print('N' + " ");
        }
        if (A3 != 0) {
            System.out.print(A3 + " ");
        } else {
            System.out.print('N' + " ");
        }
        if (A4 != 0) {
            System.out.print(A4/f4 + "." + (int)((A4 % f4 * 100/f4 + 5)/ 10)+ " ");
        } else {
            System.out.print('N' + " ");
        }
        if (A5 != 0) {
            System.out.print(A5 + " ");
        } else {
            System.out.print('N' + " ");
        }
    }
}
