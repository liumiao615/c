package L0501;

public class examp1 {
    private static class A extends Thread{
        @Override
        public void run() {
            System.out.println("A");
        }
    }
    private static class B extends Thread{
        @Override
        public void run() {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
        System.out.println("main");
    }
}
