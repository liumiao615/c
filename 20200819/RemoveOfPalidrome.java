import java.util.Scanner;
public class Main{
    public static boolean IsPalidrome(StringBuffer sb,int[] start,int[] end){
        int i = 0;
        int j = sb.length()-1;
        boolean result = true;
        while(i <= j){
            if(sb.charAt(i) != sb.charAt(j)){
                result = false;
                break;
            }
            i++;
            j--;
        }
        if(start != null){
            start[0] = i;
        }
        if(end != null){
                end[0] = j;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int sum = sca.nextInt();
        while(sum >0){
            StringBuffer sb = new StringBuffer(sca.next());
            int[] start = new int[1];
            int[] end = new int[1];
            
            if(IsPalidrome(sb,start,end)){
                System.out.println(-1);
            }else{
                sb.deleteCharAt(end[0]);
                if(IsPalidrome(sb,null,null)){
                    System.out.println(end[0]);
                }else{
                System.out.println(start[0]);
                }
            }
             sum--;
        }
    }
}