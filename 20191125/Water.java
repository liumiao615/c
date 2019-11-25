import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        while(g > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int[] C = new int[2 * a];
            for(int i = 0;i < a * 2;i++){
                int tmp = i + 1;
                for (int j = 0;j < b;j++){
                    if(tmp <= a){
                        tmp = 2*tmp - 1;
                    }else {
                        tmp = 2 * (tmp - a);
                    }
                }
                C[tmp - 1] = scanner.nextInt();
            }
            if(C.length > 0){
                System.out.print(C[0]);
            }
            for(int i = 1;i < 2 * a;i++){
                System.out.print(" " + C[i]);
            }
            System.out.println();
        }

    }
}
