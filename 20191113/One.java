public class One {
    private static class Foo {
        private static int n;
        public void one() throws InterruptedException {
            if(n != 0) {
                System.out.println("one");
                wait();
            }
        }

        public void two() throws InterruptedException {
            if(n != 1){
                System.out.println("two");
                wait();
            }
        }

        public void three() throws InterruptedException {
            if(n != 2) {
                System.out.println("three");
                wait();
            }
        }
    }

    private static Foo foo = new Foo();

    private static class OneThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.one();
            }
        }
    }

    private static class TwoThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.two();
            }
        }
    }

    private static class ThreeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.three();
            }
        }
    }

    public static void main(String[] args) {
        Thread one = new OneThread();
        Thread two = new TwoThread();
        Thread three = new ThreeThread();
        one.start();
        two.start();
        three.start();
    }
}
