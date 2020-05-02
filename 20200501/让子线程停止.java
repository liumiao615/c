package L0501;

import java.util.Scanner;

public class 让子线程停止 {
    public static boolean condition;
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while(!current.isInterrupted()){
                try {
                    System.out.println("写作业1");
                    Thread.sleep(1000);
                    System.out.println("写作业2");
                    Thread.sleep(1000);
                    System.out.println("写作业3");
                    Thread.sleep(1000);

                    System.out.println("写作业4");
                    Thread.sleep(1000);

                    System.out.println("写作业5");
                    Thread.sleep(1000);

                    System.out.println("写作业6");
                    Thread.sleep(1000);

                    System.out.println("写作业7");
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    //e.printStackTrace();
                    break;
                }

            }
        }
    }
// private static class MyRunnable implements Runnable{
//        @Override
//        public void run() {
//            while(condition){
//                System.out.println("写作业1");
//                System.out.println("写作业2");
//                System.out.println("写作业3");
//                System.out.println("写作业4");
//                System.out.println("写作业5");
//                System.out.println("写作业6");
//                System.out.println("写作业7");
//            }
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        //condition = true;
        Thread t = new Thread(new MyRunnable());
        t.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        //condition = false;
//        System.out.println("停止");
//        t.join();
//        System.out.println("子线程已经停止");
        System.out.println("准备通知停止写作业");
        t.interrupt();
        System.out.println("已经通知停止写作业");
        t.join();
        System.out.println("已经停止写作业");
    }
}
