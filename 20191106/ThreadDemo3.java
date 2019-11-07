public class ThreadDemo3 {
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
    }
}
