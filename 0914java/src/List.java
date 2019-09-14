import java.util.Arrays;

public interface List {
    void pushBack(int element);
    void pushFront(int element);
    void insert(int index,int element);
}
abstract class AbstractList implements List{
    protected int size=0;
    @Override
    public void pushBack(int element) {
        insert(size,element);
    }

    @Override
    public void pushFront(int element) {
        insert(0,element);
    }

}

//具体实现者
class ArrayList extends AbstractList implements List{
    private int[] array=new int[10];
    @Override
    public void insert(int index, int element) {
            for(int i=size;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=element;
            size++;
            System.out.println(Arrays.toString(Arrays.copyOfRange(array,0,size)));
        }


    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushFront(10);
        list.pushFront(120);
        list.insert(3,100);
    }

}