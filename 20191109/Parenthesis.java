import java.util.Stack;

public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        Stack stack = new Stack();
        char[] array = A.toCharArray();
        for(char a:array){
           switch (a){
               case '(':
                   stack.add(a);
                   break;
               case ')': {
                   if (stack.isEmpty()) {
                       return false;
                   }
                   char left = (char) stack.pop();
                   if (!(left == '(' && a == ')')) {
                       return false;
                   }
                   break;
               }
               default:
                   break;
           }

        }
        if(stack.isEmpty() ){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String A = "(()())";
        Boolean C = chkParenthesis(A,A.length());
        System.out.println(C);
    }
}
