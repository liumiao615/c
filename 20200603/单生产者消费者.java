package L0602;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class 单生产者消费者1 {

    private static 阻塞1 queue = new 阻塞1();
    private static class producer extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            try {
            while(true) {
                System.out.println("请输入下一个数字：");
                int element = scanner.nextInt();
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
            Random random = new Random(20200602);
            try {
                while (true) {

                    int element = queue.take();
                    System.out.println("消费者读出：" + element);
                    TimeUnit.SECONDS.sleep(random.nextInt(10));
                }
            }  catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }

        }

    public static void main(String[] args) {
        producer pro = new producer();
        pro.start();
        consumer con = new consumer();
        con.start();
    }
}
