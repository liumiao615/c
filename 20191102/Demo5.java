public class Demo5 {
    public static void main(String[] args) {
        Thread cur = Thread.currentThread();
        System.out.println(cur.getId());
        System.out.println(cur.getName());
        System.out.println(cur.isDaemon());
        System.out.println(cur.isInterrupted());

    }
}
