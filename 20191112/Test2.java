import java.util.Scanner;

public class Test2 {
    public static int peeksum(int m){
        int sum = 0;
        if(m > 0) {
            while(m > 1) {
                sum += m / 3;
                m = m % 3 + m / 3;
                if(m == 2){
                    sum++;
                    break;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] temp = new int[100];
//        int i = 0;
//        while (true) {
//            int data = Integer.valueOf(in.nextLine());
//   for (int j : temp) {
////            System.out.println(j);
////        }            if (data == 0)
//                break;
//            temp[i++] = peeksum(data);
//        }
//
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = in.nextLine();
            if (s.equals("0"))
                break;
            sb.append(s+" ");
        }
        String[] data = sb.toString().split(" ");
        for (String s : data) {
            System.out.println(peeksum(Integer.valueOf(s)));
        }
    }
}
