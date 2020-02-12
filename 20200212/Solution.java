//public class Solution {
//    public static String Num(String s){
//        char[] str = s.toCharArray();
//
//    }
//    public static void main(String[] args) {
//        String S = "abcd12345ed125ss123456789";
//    }
//}
import java.util.Scanner;

public class Solution {
    public static String Num(String string){
        String result = "";
        int count;
        char [] arr = string.toCharArray();
        for (int i= 0 ;i<arr.length;i++){
            if('0'<=arr[i] && '9'>= arr[i]){//当前的是数字
                count = 1;//初始化计算器
                int index = i;//在后面的循环存储截至索引
                for(int j=i+1;j<arr.length;j++){
                    if('0'<=arr[j] && '9'>= arr[j]){
                        count++;
                        index =j;
                    }else {
                        break;
                    }
                }
                if(count>result.length()){
                    result = string.substring(i,index+1);
                }
            }else {
                continue;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(Num(string));
    }
}
