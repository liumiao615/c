import java.util.Stack;

public class reverseOnlyLetter {
    public static String reverseOnlyLetters(String S) {
        Stack stack = new Stack();
        for(char c: S.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c:S.toCharArray()){
            if(Character.isLetter(c)){
                ans.append(stack.pop());
            }else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String S = " Test-Leet = code - Q !";
        System.out.println(reverseOnlyLetters(S));
    }
}
