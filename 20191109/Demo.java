public class Demo {
    private static class Printer1 extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("11111");
            }
        }
    }
    private static class Printer2 extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("22222");
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Printer1());
        Thread thread1 = new Thread(new Printer2());
        thread.start();
        thread1.start();
    }
}
