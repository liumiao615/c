import java.util.Scanner;

public class corn {
    public static int Min(String S){
        String[] arr = S.split("\\.");
//        int Galleon = 0;
//        int Sickle = 0;
//        int Knut = 0;
//        int j = 2;
//        for(int i = 0;i < arr.length ;i++){
//            if(j == arr.length - 1) {
//                Galleon = Integer.parseInt(arr[i]);
//                Sickle = Integer.parseInt(arr[i+1]);
//                Knut = Integer.parseInt(arr[i+2]);
//                j--;
//            }else {
//                break;
//            }
//        }
        int Galleon = Integer.parseInt(arr[0]);
        int Sickle = Integer.parseInt(arr[1]);
        int Knut = Integer.parseInt(arr[2]);
        int count = Galleon * 17 * 29 + Sickle * 29 + Knut;

        return count;
    }
    public static String reverse(int count){

        int Galleon = count / 17 / 29;
        count = count - Galleon * 17 * 29;
        int Sickle = count / 29;
        count = count - Sickle * 29;
        int Knut = count;
        String S = Galleon + "." + Sickle + "." + Knut;
        return S;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
            String s1 = arr[0];
            String s2 = arr[1];
        int count = Min(s2) - Min(s1);
        if(count == 0){
            System.out.println("0");
        }else if(count > 0){
            System.out.println(reverse(count));
        }else {
            int c = -(count);
            System.out.println("-" + reverse(c));
        }
    }
}
