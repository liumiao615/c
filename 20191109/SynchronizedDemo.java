public class SynchronizedDemo {
    public synchronized void method(){
        for(int i = 0;i < 100000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
              object.method();
            }

        }
        private SynchronizedDemo object;
        MyThread(SynchronizedDemo object){
            this.object = object;
        }
    }
    public static void main(String[] args) {
        SynchronizedDemo object = new SynchronizedDemo();
        Thread thread = new MyThread(object);
        thread.start();
        while (true){
            object.method();
        }
    }
}
