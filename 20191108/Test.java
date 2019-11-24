public class Test {
    private int data;
    int result = 0;

    public void m() {
        result += 2;
        data += 2;
        System.out.println(result + " " + data);
    }
}
class ThreadExample extends Thread{
    private Test mv;
    public ThreadExample(Test mv){
        this.mv = mv;
    }

    @Override
    public void run() {
        synchronized (mv){
            mv.m();
        }
    }
}
class ThreadTest{
    public static void main(String[] args) {
        Test mv = new Test();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}