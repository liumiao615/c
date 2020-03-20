import java.util.*;
public class Reord {
    public static String Reord(String S){
        Stack stack = new Stack();
        String S1 = "";
        for(char c:S.toCharArray()){
            stack.push(c);
        }
        for(char c:S.toCharArray()){
            S1 += stack.pop();
        }
        return S1;
    }
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String S = sca.nextLine();
        String S1 = Reord(S);
        String[] arr = S1.split(" ");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                sb.append(Reord(arr[i]));
            }else{
                sb.append(Reord(arr[i]));
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
