import java.util.Stack;

public class StackRebuild {

    Stack<Integer> sta1 = new Stack<>();
    Stack<Integer> Min_sta2 = new Stack<>();
    public void push(int node) {
        sta1.push(node);
        if(Min_sta2.empty() || node < Min_sta2.peek()){
            Min_sta2.push(node);
        }else{
            Min_sta2.push(Min_sta2.peek());
        }
    }
    
    public void pop() {
        sta1.pop();
        Min_sta2.pop();
    }
    
    public int top() {
        return sta1.peek();
    }
    
    public int min() {
        return Min_sta2.peek();
    }
}