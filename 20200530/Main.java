package L0530;

public class Main {
    public static class Mythread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Mythread();
        System.out.println(thread.getState());
        thread.start();
        //Thread.sleep(1000);
        while(thread.isAlive()) {
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
    }
}

