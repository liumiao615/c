package L0502;

public class 观察线程不安全 {
    static long n = 0;
    static final long Count = 10_0000_000L;
    static class ADD extends Thread{
        @Override
        public void run() {
            for(long i = 0;i <Count;i++){
                n++;
            }
        }
    }
    static class SUB extends Thread{
        @Override
        public void run() {
            for(long i = 0;i <Count;i++){
                n--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ADD add = new ADD();
        SUB sub = new SUB();
        add.start();
        add.join();

        sub.start();
        sub.join();
        System.out.println(n);
    }
}
