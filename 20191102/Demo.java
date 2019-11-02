public class Demo {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("在 method 中打印");
                // 进程会暂停运行 1 秒
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        method();
        while(true){
            System.out.println("在 main 中打印");
            Thread.sleep(1000);
        }
    }

    private static void method() {
        Thread thread = new MyThread();
        thread.start();
    }
    private static void method1() throws InterruptedException {
        while (true) {
            System.out.println("在 method1 中打印");
            // 进程会暂停运行 1 秒
            Thread.sleep(1000);
        }
    }
}
