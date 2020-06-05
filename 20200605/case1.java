package why;
//计算1+。。。。。。+number
public class case1 {
    static final int count = 10;
    static final int number = 100000;
    static void 单线程(){
        long b = System.nanoTime();
        for(int i = 0;i < count;i++){
            System.out.println(sum());
        }
        long e = System.nanoTime();
        double s = (e-b)/1000_000_000.0;
        System.out.printf("单线程，运行时间：%f%n",s);
    }

    private static long sum() {
        long result = 0;
        for(int i = 0;i < number;i++){
            result += i;
        }
        return result;
    }

    static void 多线程() throws InterruptedException {
        long b = System.nanoTime();

        Thread[] thread = new Thread[count - 1];
        for(int i = 0;i < count - 1;i++){
            thread[i] = new MyThread();
            thread[i].start();
        }

       sum();

        //当前线程计算完成，需要等其他线程结束

        for(int i = 0;i < count - 1;i++){
            thread[i].join();
        }
        System.out.println(sum());
        long e = System.nanoTime();
        double s = (e-b)/1000_000_000.0;
        System.out.printf("多线程运行时间：%f%n",s);
    }
    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println(sum());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        单线程();
        System.out.println("=================================");
        多线程();
    }
}
