package L0501;

public class 线程状态变化 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < 100000;i++){
                i+=1;
            }
        }
    }

    public static void main1(String[] args) {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        while(thread.isAlive()){
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
    }

    public static void main(String[] args) {

    }
}
