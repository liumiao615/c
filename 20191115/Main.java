public class Main {
    public static class printerzs implements Runnable{
        @Override
        public void run() {
            while(true){
                System.out.println("zs");
            }
        }
    }
    public static class printerls implements Runnable{
        @Override
        public void run() {
            while(true){
                System.out.println("ls");
                Thread.yield();
            }
        }
    }
    public static class Mythread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Mythread();
//        System.out.println(thread.getState());
//        thread.start();
//        //Thread.sleep(1000);
//        while(thread.isAlive()) {
//            System.out.println(thread.getState());
//        }
//        System.out.println(thread.getState());
        Thread thread1 = new Thread(new printerls());
        Thread thread2 = new Thread(new printerzs());
        thread1.start();
        thread2.start();
    }
}
