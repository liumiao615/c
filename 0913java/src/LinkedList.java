import java.util.Arrays;

class Node{
    int val;
    Node next;
}
public class LinkedList extends List {
    private Node first=null;

    @Override
    public void insert(int index, int element) {
        Node node=new Node();
        node.val=element;
        if(index==0){
            node.next=first;
            first=node;
        }else if(index==size){
            Node last=first;
            while(last.next!=null){
                last=last.next;
            }
            last.next=node;
            node.next=null;
        }else{
            Node prev=first;
            for(int i=0;i<index-1;i++){
                prev=prev.next;
            }
            node.next=prev.next;
            prev.next=node;
        }
        size++;

        //将链表的值复制到一个数组中
        int[] a=new int[size];
        Node cur=first;
        int i=0;
        while(cur!=null){
            a[i]=cur.val;
            i++;
            cur=cur.next;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushFront(10);
        list.pushFront(120);
        list.insert(3,100);
    }
}
