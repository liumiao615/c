import java.util.ArrayList;

public class isValid {
    public static boolean isValid(String s,int n){
        ArrayList<Character> stack = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            char C = s.charAt(i);

            switch (C){
                case'(':
                    stack.add(C);
                    break;
                case')':{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char left = stack.remove(stack.size()-1);
                    if(!(left == '(' && C == ')')){
                        return false;
                    }
                    break;
                }
                default:
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String A = "(()a())";
        Boolean C = isValid(A,A.length());
        System.out.println(C);
    }
}
