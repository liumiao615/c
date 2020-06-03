package L0602;

public class 阻塞2 {
    private static final int COUNT = 5;
    private int[] queue = new int[COUNT];
    private int size = 0;
    private int frontIndex = 0;
    private int rearIndex = 0;

    //放入队列
    public synchronized void put(int element) throws InterruptedException {
        while(size == queue.length){
            wait();
            //throw new RuntimeException("队列已满");
        }

        queue[rearIndex] = element;
        rearIndex = rearIndex+1;
        if(rearIndex == queue.length){
            rearIndex = 0;
        }
        size++;
        notifyAll();
    }
    //从队列中取
    public synchronized int take() throws InterruptedException {
        while(size == 0){
            wait();
            //throw new RuntimeException("队列一空");
        }
        int element = queue[frontIndex];
        frontIndex += 1;
        if(frontIndex == queue.length){
            frontIndex = 0;
        }
        size--;
        notifyAll();
        return element;
    }
}
