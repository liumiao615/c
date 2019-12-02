
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

    public class sss1 {
        public static String CharUnio(String s){
            Stack stack = new Stack();
            String[] A = new String[100];
            //把所有数据拆分到A数组中
            for(int i = 0;i < s.length();i++){
                A[i] = String.valueOf(s.toCharArray()[i]);
            }
            Map<String,Integer> map = new HashMap<>();
            for(String t : A){
                int count = map.getOrDefault(t,0);
                //在这里判断当一旦有count=1的说明开始重复，则跳出
                if (count == 1)
                    break;
                map.put(t,count + 1);
                stack.push(t);
            }
            //用来存放栈弹出的数据
            String[] D = new String[stack.size()];
            for(int i = map.size()-1;i >= 0;i--){
                D[i] = (String) stack.pop();
            }
            //使用StringBuilder进行字符串拼接
            StringBuilder sb = new StringBuilder();
            for (String data : D) {
                sb.append(data);
            }
            return sb.toString();
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println(CharUnio(s));
        }
    }

