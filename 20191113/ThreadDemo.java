public class ThreadDemo {
    public static class MyThread extends Thread {
        @Override
        public void run() {

        }
    }

    public static class MYRunnable implements Runnable {
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(new MYRunnable());
        Thread thread3 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        thread3.start();

        //匿名类
        Thread thread4 = new Thread() {
            @Override
            public void run() {

            }
        };
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread thread6 = new Thread(() -> {
        });
    }
}