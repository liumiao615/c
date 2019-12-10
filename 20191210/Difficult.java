import java.util.Scanner;

public class Difficult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            for(int i = 0;i < s.length();i++){
                char c = chars[i];
                if('A' <= c){
                    c = (char)(c > 'E'?(c - 5):(c + 21));
                    chars[i] = c;
                }
            }
            System.out.println(chars);
        }
    }
}
