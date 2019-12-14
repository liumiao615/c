public class Solution {
    CNode copy(CNode head) {
        if (head == null) {
            return null;
        }

        CNode p1 = head;
        while (p1 != null) {
            CNode p2 = new CNode(p1.val);

            p2.next = p1.next;
            p1.next = p2;

            p1 = p2.next;
        }

        p1 = head;
        while (p1 != null) {
            CNode p2 = p1.next;
            if (p1.random != null) {
                p2.random = p1.random.next;
            }

            p1 = p2.next;
        }

        p1 = head;
        CNode newHead = head.next;
        while (p1 != null) {
            CNode p2 = p1.next;
            p1.next = p2.next;
            if (p2.next != null) {
                p2.next = p2.next.next;
            }

            p1 = p1.next;
        }

        return newHead;
    }
}
