package L0602;

import java.util.concurrent.*;

public class JAVA原生提供的 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> q;
        q = new ArrayBlockingQueue<>(16);
        q = new LinkedBlockingDeque<>();
        q = new PriorityBlockingQueue<>();
        //q.put(" ss");
    }
}
