public class OneTwoThree {
    private static class Foo {
        private int n = 0;
        public void one() {
            synchronized (this) {
                if(n != 0){
                    return;
                }
                n = 1;
                System.out.println("one");
            }
        }

        public void two() {
            synchronized (this) {
                if(n != 1){
                    return;
                }
                n = 2;
                System.out.println("two");
            }
        }

        public void three() {
            synchronized (this){
                if(n != 2){
                    return;
                }
                n = 0;
                System.out.println("three");

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
