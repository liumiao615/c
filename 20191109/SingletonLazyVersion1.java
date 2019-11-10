public class SingletonLazyVersion1 {
    private SingletonLazyVersion1(){}
    private static SingletonLazyVersion1 instance = null;

    public synchronized static SingletonLazyVersion1 getInstance(){
        if(instance == null){
            instance = new SingletonLazyVersion1();
        }
        return instance;
    }
}
