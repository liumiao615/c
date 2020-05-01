package L0501;

public class 线程属性 {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.getState());
            System.out.println(current.isAlive());
            /*
            System.out.println(this.isInterrupted());
            System.out.println(this.isDaemon());
             */
        }
    }
    private static class MyThread extends Thread {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.println(current.getId());
            System.out.println(current.getName());
            System.out.println(current.getPriority());
            System.out.println(current.getState());
            System.out.println(current.isAlive());
            System.out.println(this.isInterrupted());
            System.out.println(this.isDaemon());
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        System.out.println("===============================");
        Thread t = new Thread(new MyRunnable());
        t.start();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        print();
    }

    private static void print() {
        Thread current = Thread.currentThread();

        System.out.println(current.getName());
        System.out.println(current.getState());
        System.out.println(current.getPriority());
        System.out.println(current.isInterrupted());
        System.out.println(current.isAlive());
        System.out.println(current.isAlive());
        System.out.println("11111111111111111111111111");
    }
}
