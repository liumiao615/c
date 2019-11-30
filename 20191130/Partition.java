//public class Partition {
//    public class ListNode {
//        int val;
//        ListNode next = null;
//
//        ListNode(int val) {
//            this.val = val;
//        }
//        public ListNode partition(ListNode pHead, int x) {
//            if (pHead == null || pHead.next == null) {
//                return pHead;
//            }
//            ListNode node = new ListNode(x);
//            ListNode head = pHead;
//            while (head != null) {
//                ListNode next = head.next;
//                if (head.val > x) {
//                    node.next = head;
//                    node = node.next;
//                } else {
//                    head.next = node;
//                    node = head;
//                }
//                head = next;
//            }
//            return node;
//        }
//    }
//}
import java.util.*;






public class Partition {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
        ListNode small = null;
        ListNode smalllast = null;
        ListNode big = null;
        ListNode biglast = null;
        ListNode head = pHead;
        while (head != null) {
            if (head.val < x) {
                if (small == null) {
                    small = head;
                } else {
                    smalllast.next = head;
                }
                smalllast = head;
            } else {
                if (big == null) {
                    big = head;
                } else {
                    biglast.next = head;
                }
                biglast = head;
            }
            head = head.next;
        }
        if (small == null) {
            return big;
        } else {
            smalllast.next = big;
        }
        if (biglast != null) {
            biglast.next = null;
        }
        return small;
    }
}
