import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] A = new String[str.length()];
        for(int i = 0;i <str.length();i++){
            A[i] = String.valueOf(str.charAt(i));
        }
        for(int i = 0;i < A.length/2;i++){
            Swap(A,i,A.length-1-i);
        }
        for(String S:A){
            System.out.print (S);
        }
    }

    private static void Swap(String[] A, int i, int j) {
        String a = A[i];
        A[i] = A[j];
        A[j] = a;
    }
}
