import java.util.ArrayList;

public class MinStackA {
    private ArrayList<Integer> normal;
    private ArrayList<Integer> min;
    public MinStackA() {
        normal=new ArrayList<>();
        min=new ArrayList<>();
    }

    public void push(int x) {
        normal.add(x);
        if(min.isEmpty()){
            min.add(x);
        }else if(x<min.get(min.size()-1)) {
            min.add(x);
        }else {
            min.add(min.get(min.size() - 1));
        }
    }

    public void pop() {
        min.remove(min.size()-1);
        normal.remove(min.size()-1);
    }

    public int top() {
        return normal.get(normal.size()-1);
    }

    public int getMin() {
        return min.get(min.size()-1);
    }
}