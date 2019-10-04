import java.util.PriorityQueue;

public class MypriorityQueue {
    private int[] array = new int[100];
    private int size = 0;

    public void offer(int e){
        array[size++] = e;
        Solution.shiftup(array,size-1);
    }
    public int poll(){
        int e = array[0];
        array[0] = array[--size];
        Solution.shiftDownSmall(array,0,size);
        return e;
    }
    public int peek(){
        return array[0];
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(7);
        q.offer(9);
        q.offer(5);
        q.offer(1);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
