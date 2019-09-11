class Node{
    Node next=null;
    Node prev=null;
    int val;

    Node(int val){
        this.val=val;
    }
}
public class MyLinkedList {
    private Node head=null;
    private Node last=null;
    private int size=0;

    public void pushFront(int size){
        Node node = new Node(size);
        node.next=head;
        if(head!=null){
           head.prev=node;
        }else{
            last=node;
        }
        head=node;
        size++;
    }

    public void popFront(){
        if(size<=0){
            System.out.println("无法对空链表进行删除");
            return;
        }
        head=head.next;
        if(head==null){
            last=null;
        }else{
            head.prev=null;
        }
        size--;
    }

    public void pushBack(int k){
        Node node=new Node(k);
        if(head==null){
            head=node;
        }else{
            last.next=node;
        }
        node.prev=last;
        last=node;
        size++;
    }

    public void popBack(){
        if(size<=0){
            System.out.println("无法对空链表进行删除");
            return;
        }
        if(head==last){
           head= last=null;
        }else{
            last.prev.next=null;
            last=last.prev;
        }
        size--;
    }

    public void add(int index;int val){

    }
}
