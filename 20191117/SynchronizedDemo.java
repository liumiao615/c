public class SynchronizedDemo {
    public synchronized void method(){
        for(int i = 0;i <  1000;i++){
            System.out.println(Thread.currentThread().getName() + " :" + i);
        }
    }
    public synchronized void method2(){
        for(int i = 0;i <  1000;i++){
            System.out.println(Thread.currentThread().getName() + " :" + i);
        }
    }
    public static class Mythread extends Thread{
        @Override
        public void run() {
            while(true){
                syn.method();
            }
        }
        private SynchronizedDemo syn;
        Mythread(SynchronizedDemo syn) {
            this.syn = new SynchronizedDemo();
        }
    }
    public static void main(String[] args) {
        SynchronizedDemo syn = new SynchronizedDemo();
        Thread thread = new Mythread(syn);
        thread.start();
        while(true){
            //syn.method();
            syn.method2();
        }
    }
}
