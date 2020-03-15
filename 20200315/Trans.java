import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Trans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        char[] arr1 = S.toCharArray();
        int[] cou = new int[arr1.length];
        int count = 0;
        for(int i = arr1.length - 1;i >= 0;i--){
            if(arr1[i] >= '0' && arr1[i] <= '9'){
                cou[i] = Integer.parseInt(String.valueOf(arr1[i]));
            }else if(arr1[i] == 'A'){
                cou[i] = 10;
            }else if(arr1[i] == 'B'){
                cou[i] = 11;
            }else if(arr1[i] == 'C'){
                cou[i] = 12;
            }else if(arr1[i] == 'D'){
                cou[i] = 13;
            }else if(arr1[i] == 'E'){
                cou[i] = 14;
            }else if(arr1[i] == 'F'){
                cou[i] = 15;
            }else {
                continue;
            }
        }
        for(int i = 0;i < cou.length;i++) {
            stack.push(cou[i]);
        }
        for(int i = 0;i < cou.length;i++){
           cou[i] = (int) stack.pop();
        }
        for(int i = 0;i < cou.length;i++){
             count += cou[i] * Math.pow(16,i);
        }
        sb.append(count);
        System.out.println(Arrays.toString(cou));
        System.out.println(count);
        System.out.println(sb);
    }
}
