public interface List {
    void pushBack(int element);

    void pushFront(int element);

    void insert(int index, int element);
}

abstract class AbstractList implements List {
    protected int size = 0;

    @Override
    public void pushBack(int element) {
        insert(size, element);
    }

    @Override
    public void pushFront(int element) {
        insert(0, element);
    }
}

class ArrayList extends AbstractList implements List {
    private int[] array = new int[100];

    @Override
    public void insert(int index, int element) {
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }
}

class LinkedList extends AbstractList implements List {
    @Override
    public void insert(int index, int element) {
    }
}
