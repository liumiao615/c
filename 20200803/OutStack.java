import java.util.ArrayList;
import java.util.*;
public class OutStack {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int j = 0;
        for(;i < pushA.length;i++){
            st.push(pushA[i]);
            while(!st.empty() && st.peek() == popA[j]){
                st.pop();
                j++;
            }
        }
        return st.empty();
    }
}