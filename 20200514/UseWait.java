package L0513;

import java.util.Scanner;

public class UseWait {
    static Object o = new Object();

    static class A extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                    if (i == 30) {
                        synchronized (o) {
                            o.wait();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.start();
        Thread.sleep(2*1000);
        System.out.println("-----------");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        synchronized (o){
            o.notify();
        }
    }
}
