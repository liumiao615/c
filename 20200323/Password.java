import java.util.*;

public class Password{
    public static String PassWord(String S){
        String S2 = "";
        StringBuffer S1 = new StringBuffer();
//        for(char c:S.toCharArray()){
//            if(c >='a' && c <= 'y'){
//                S1.append((char)(c-31));
//            }if(c == 'z'){
//                S1.append('A');
//            }
//            if(c >='A' && c <= 'Y'){
//                S1.append((char)(c+33));
//            }if(c == 'Z'){
//                S1.append('a');
//            }
//            if(c >='0' && c <= '8'){
//                S1.append((char)(c+1));
//            }if(c == '9'){
//                S1.append('0');
//            }
//            if(c == '\0'){
//                break;
//            }
//        }
        char[] arr = S.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >='a' && arr[i] <= 'y'){
                S1.append((char)(arr[i]-31));
            }if(arr[i] == 'z'){
                S1.append('A');
            }
            if(arr[i] >='A' && arr[i] <= 'Y'){
                S1.append((char)(arr[i]+33));
            }if(arr[i] == 'Z'){
                S1.append('a');
            }
            if(arr[i] >='0' && arr[i]<= '8'){
                S1.append((char)(arr[i]+1));
            }if(arr[i] == '9'){
                S1.append('0');
            }
        }
        S2 = S2 + S1;
        return S2;
    }
    public static String result(String S){
        String S2 = "";
        StringBuffer S1 = new StringBuffer();
//        for(char c:S.toCharArray()){
//            if(c >='b' && c <= 'z'){
//                S1.append((char)(c-33));
//            }if(c == 'a'){
//                S1.append(('Z'));
//            }
//            if(c >='B' && c <= 'Z'){
//                S1.append((char)(c+31));
//            }if(c == 'A'){
//                S1.append('z');
//            }
//            if(c >='1' && c <= '9'){
//                S1.append((char)(c-1));
//            }if(c == '0'){
//                S1.append('9');
//            }
//            if(c == '\0'){
//                break;
//            }
//        }
        char[] arr = S.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >='b' && arr[i] <= 'z'){
                S1.append((char)(arr[i]-33));
            }if(arr[i] == 'a'){
                S1.append(('Z'));
            }
            if(arr[i] >='B' && arr[i] <= 'Z'){
                S1.append((char)(arr[i]+31));
            }if(arr[i] == 'A'){
                S1.append('z');
            }
            if(arr[i] >='1' && arr[i] <= '9'){
                S1.append((char)(arr[i]-1));
            }if(arr[i] == '0'){
                S1.append('9');
            }
        }
        S2 += S1;
        return S2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
//        String S1 = "5H706q4ZyqmI30wao78ES57M5xxT9gQ8k23b2wC61uy919OY0Ih44NLK";
//        String S2 = "Sn0vq8c3KN";
        System.out.println(PassWord(S1));
        System.out.println(result(S2));
    }
}
