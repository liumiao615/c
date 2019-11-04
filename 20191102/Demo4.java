
public class Demo4 {
    private static class MyThread extends Thread{
        private int count = 1000000;

        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i < count;i++){
                sum += i;
            }
            System.out.println("p1:1+2+.....=" + sum);
        }
    }
    private static class MyThread2 extends Thread{
        private int count = 1000001;

        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i <= count;i+=2){
                sum += i;
            }
            System.out.println("p2:1+3+5.....=" + sum);
        }
    }
    private static class MyThread3 extends Thread{
        private int count =1000000;

        @Override
        public void run() {
            long sum = 0;
            for(int i = 1;i <= count;i++){
                sum += (i^2);
            }
            System.out.println("p3:1^1+2^2+.....=" + sum);

        }
    }
        public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread2();
        Thread thread3 = new MyThread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
