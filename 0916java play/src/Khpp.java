import java.util.ArrayList;

public class Khpp {
    public static boolean IsValid(String s){
        ArrayList<Character> stack=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            switch (c){
                case '[':
                case '{':
                case '(':
                    stack.add(c);
                    break;
                case ')':
                case '}':
                case ']':{
                    if(stack.isEmpty()){
                        return false;
                    }
                    char b=stack.remove(i-1);
                    if(!((b=='{'&&c=='}')||(b=='['&&c==']')||(b=='('&&c==')'))){
                        return false;
                    }
                    break;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        String s="[]";
        boolean b = IsValid(s);
        System.out.println(b);
    }
}
