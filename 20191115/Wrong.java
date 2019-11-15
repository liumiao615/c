public class Wrong {
    private static int n = 0;
    private static final int count = 100000;
    public static class Add extends Thread{
        @Override
        public void run() {
            for(int i= 0;i < count;i++){
                n++;
            }
        }
    }
    private static class Sub extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < count;i++){
                n--;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Add();
        Thread thread2 = new Sub();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(n);
    }
}
