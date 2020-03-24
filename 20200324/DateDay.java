import java.util.Scanner;

public class DateDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int data = scanner.nextInt();

            int []monDay = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(((year / 4 == 0) && (year / 100 != 0)) || (year / 400 == 0)){
                monDay[1] = 29;
            }
            int count = 0;
            for(int i = 0;i < month - 1;i++){
                count += monDay[i];
            }
            count += data;
            System.out.println(count);
        }

    }
}
