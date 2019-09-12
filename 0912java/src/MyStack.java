import java.util.LinkedList;

public class MyStack {
  private LinkedList<Integer> queue=new LinkedList<>();

    public void push(int x){
        queue.addLast(x);
    }

    public int pop(){//移除栈顶元素
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.pollFirst();//返回第一个元素
            queue.addLast(v);
        }
        return queue.pollFirst();
    }
    public int top() {//获取栈顶元素
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.pollFirst();//返回第一个元素
            queue.addLast(v);
        }
        int v= queue.pollFirst();
        queue.addLast(v);
        return v;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
