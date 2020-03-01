
public class isPalindrome {
    public static boolean ispalindrome(String S){
        int i = 0;
        char[] arr = new char[S.length()];
       for(char c:S.toCharArray()) {
           if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
               arr[i++] = c;
           }
       }
       String S1 = "";
       String S2 = "";
       for(int j = 0;j < i;j++){
           S1 += arr[j];
       }
       for(int k = i - 1;k >= 0;k--){
           S2 += arr[k];
       }
       return S1.equalsIgnoreCase(S2);
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome("0p"));

    }
}
