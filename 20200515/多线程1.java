package L0513;
import java.util.Scanner;


public class 多线程1 {
    int[] array = new int[10];
    int front = 0;
    int rear = 0;
    int size = 0;

    synchronized void put(int value) throws InterruptedException {
        if(size == array.length){
            //throw new RuntimeException("队列已满");
            wait();
        }

        array[rear] = value;
        rear++;
        if(rear == array.length){
            rear = 0;
        }
        //rear = (rear + 1) % array.length;
        size++;
        notify();
    }
    synchronized int take() throws InterruptedException {
        if(size == 0){
            //throw new RuntimeException("队列已空");
            wait();
        }
//        front = (front+1) % array.length;
        int value = array[front];
        front++;
        if(front == array.length){
            front = 0;
        }
        size--;
        notify();
        return value;
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            for(int i = 0;i < 99;i++){
                System.out.println("准备放入");

                System.out.println("放入成功");
            }
        }
    }
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        while(true){
            scanner.nextLine();
            System.out.println();
        }
    }
}
