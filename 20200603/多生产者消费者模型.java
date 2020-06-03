package L0602;


import java.util.Random;

public class 多生产者消费者模型 {
    private static 阻塞2 queue = new 阻塞2();
    private static class producer extends Thread{
        @Override
        public void run() {
            //Scanner scanner = new Scanner(System.in);
            Random random = new Random(20200603);
            try {
                while(true) {
                    int element = random.nextInt();
                    queue.put(element);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class consumer extends Thread{

        @Override
        public void run() {
            try {
                while (true) {
                    queue.take();
                }
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        for(int i = 0;i < 10;i++){
            new producer().start();
        }
        for(int i = 0;i < 10;i++){
            new consumer().start();
        }
    }
}