import java.util.Scanner;
import java.util.Stack;

public class Speak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String S = scanner.nextLine();
        //String S = "Hello World Here I Come";
        String[] arr = S.split(" ");
        Stack stack = new Stack();
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1) {
                stack.push(arr[i]);
            }else {
                stack.push(arr[i]);
                stack.push(" ");
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0;j < arr.length * 2 - 1;j++){
            sb.append(stack.pop());
            //            sb.append(stack.pop() + " ");
        }

        System.out.println(sb);
    }
}
