package L0501;

public class example2 {
    private static class A extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < 10;i++){
                System.out.println(i);
            }
        }
    }
    private static class B implements Runnable{
        @Override
        public void run() {
            for(int i = 100;i < 110;i++){
                System.out.println(i);
            }
        }
    }
    private static class C extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < 10;i++){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread A = new A();//创建一个线程对象，要干的工作在线程中
        A.start();
        A.join();
        System.out.println("Ajieshu" );
        Thread B = new Thread(new B());//创建一个具体实现，给创建出来的B线程对象
        B.start();
        B.join();
        System.out.println("Bjieshu");
        Runnable c = new C();//创建一个thread对象，因为thread实现了runnable，所以用c
        Thread C = new Thread(c);
        //Thread C = new Thread(new C());
        C.start();
        C.join();
        System.out.println("Cjieshu");
    }
    private static void 了解(){
        Thread a = new Thread(){
            @Override
            public void run() {
                //
            }
        };
        Thread b = new Thread(new B()){
            @Override
            public void run() {
                //
            }
        };
    }
}
