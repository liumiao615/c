public class Demo {

}
class MyArrayList<E>{
    public static class Node<E>{

    }
    E[] array;
    int size;

    public MyArrayList(){
        array = (E[])new Object[13];

    }
    public void add(E e){
        array[size++] = e;
    }
    public E remove(){
        E element = array[size - 1];
        array[size - 1] = null;
        size--;
        return element;
    }

}
