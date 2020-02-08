public class isPalindrome {
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        String str =String.valueOf(x);
        sb.append(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome1(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int result = 0;
        int x1 = x;
        while(x >= 0){
            result = result * 10 + x % 10;
            x1 = x1/10;
        }
        return result == x;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome1(121));
    }
}
