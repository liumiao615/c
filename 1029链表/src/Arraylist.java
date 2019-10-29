class Node{
    int val;
    Node next;
    Node(int x){
        val = x;
    }
}
public class Arraylist {
    private static Node pushFront(Node head, int val){
        Node node = new Node(val);
        Node cur = head;
        node.next = cur;
        cur = node;
        return cur;
    }
    private static Node pushBack(Node head,int val){
        Node node = new Node(val);
        Node cur = head;
        while(cur != null){
            cur = cur.next;
        }
        cur.next = node;
        node.next = null;
        return head;
    }
    private static Node popFront(Node head){
        Node cur = head;
        cur = cur.next;
        return cur;
    }
    private static Node popBack(Node head){
        if(head == null){
            System.out.println("error");
        }
        Node cur = head;
        while(cur.next.next!= null){
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        pushFront(head,2);
        pushFront(head,3);
        popBack(head);
        pushBack(head,1);
        popBack(head);
    }
}
