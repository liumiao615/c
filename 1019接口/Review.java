class Node {
    int val;
    Node next;
}

public class Review {
    public Node deleteDuplicated(Node head) {
        Node prev = new Node();
        Node fake = prev;
        prev.next = head;
        Node p = head;
        Node q = head.next;

        while (q != null) {
            if (p.val != q.val) {
                prev = p;
                p = q;
                q = q.next;
            } else {
                while (q != null && q.val == p.val) {
                    q = q.next;
                }

                prev.next = q;
                p = q;
                if (q != null) {
                    q = q.next;
                }
            }
        }

        return fake.next;
    }
}
