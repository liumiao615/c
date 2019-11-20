import java.util.Scanner;
public class Squ {
    public static void Conture(String[] S){
        int A = Integer.valueOf(S[0]);
        for(int i = 0;i < A/2;i++){
            for(int j = 0;j < A;j++){
                if(j == 0 || i== 0 || j == A - 1 || i== A/2 -1){
                    System.out.print(S[1]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        Conture(s);
        //System.out.println(Arrays.toString(s));
    }
}
