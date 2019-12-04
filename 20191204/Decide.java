import java.util.Arrays;
import java.util.Scanner;

public class Decide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(A));
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int A4 = 0;
        int A5 = 0;
        int flag = 1;
        int count = 0;
        for (int i : A) {
            //A1
            if (i % 5 == 0) {
                if (i % 2 == 0) {
                    A1 += i;
                }
            }
            //A2
            if (i % 5 == 1) {
                A2 += flag * i;
                flag = -flag;
            }
            //A3
            if (i % 5 == 2) {
                A3++;
            }
            //A4
            if (i % 5 == 3) {
                A4 += i;
                count++;
            }
            //A5
            if (i % 5 == 4) {
                if (i > A5) {
                    A5 = i;
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
            System.out.print(A4/count + "." + (int)((A4 % count * 100/count + 5)/ 10)+ " ");
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
