public class List {
    protected int size=0;

    public void insert(int index,int element){
        System.out.println("xxx");
    }
    public void pushFront(int element){
        insert(0,element);
    }
    public void pushBack(int element){
        insert(size,element);
    }
}
