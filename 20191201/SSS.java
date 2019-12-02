import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SSS {
    public static String CharUnio(String s){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        String[] A = new String[100];
        String[] D = new String[100];
        for(int i = 0;i < s.length();i++){
            A[i] = String.valueOf(s.toCharArray());
        }
        Map<String,Integer> map = new HashMap<>();
        for(String t:A){
            int count = map.getOrDefault(t,0);
            map.put(t,count + 1);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            String C= e.getKey();
            int B = e.getValue();
            if(B == 1){
                stack1.push(C);
                stack2.push(stack1.pop());
            }else {
                continue;
            }
        }
        //String E = (String) stack2.pop();
        for(int i = 0;i < s.length();i++){
            D[i] = (String) stack2.pop();
        }
        return D.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(CharUnio(s));
    }
}
