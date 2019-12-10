import java.util.Scanner;

public class Rabbit {
    public static int SUM(int rub){
        if(rub == 1 || rub == 2){
            return 1;
        }
        return SUM(rub - 1)+SUM(rub - 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int rabbit = s.nextInt();
            System.out.println(SUM(rabbit));
        }
    }
}
