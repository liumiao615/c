import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> out;
    private ArrayList<Integer> in;
    public MyQueue(){
        out=new ArrayList<>();
        in=new ArrayList<>();
    }
    public void push(int x){
        in.add(x);
    }
    public int pop(){
        if(out.isEmpty()){
            int size=in.size();
            for(int i=0;i<size;i++){
               int v= in.remove(in.size()-1);
               out.add(v);
            }
        }
        return out.remove(out.size()-1);
    }
    public int peek() {//返回队列首部元素
        if (out.isEmpty()) {
            int size = in.size();
            for (int i = 0; i < size; i++) {
                int v = in.remove(in.size() - 1);
                out.add(v);
            }

        }
        return out.get(out.size() - 1);
    }
    public boolean empty(){
        return in.isEmpty()&&out.isEmpty();
    }
}
