import java.util.Timer;
import java.util.TimerTask;

class MyTimer {
    public void execute(Runnable task, long delay) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(delay);
                    task.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

public class UseTimer {
    private static class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("该起床了");
        }
    }
    public static void main(String[] args) {
        // 闹钟
//        Timer timer = new Timer();
//        timer.schedule(new MyTimerTask(), 1000);
//        System.out.println("我是另一个人");

        MyTimer timer = new MyTimer();
        timer.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("该起床了");
            }
        }, 1000);
        System.out.println("我是另一个人");
    }
}
