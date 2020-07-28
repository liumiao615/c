package J0728;

import java.util.Stack;

public class FindKToTheTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode FindKthToTail(ListNode head, int k) {
            if(head == null || k < 0){
                return null;
            }
            ListNode front = head;
            ListNode rear = head;

            while(k > 0 && front != null){
                k--;
                front = front.next;
            }
            while(front != null){
                front = front.next;
                rear = rear.next;
            }
            return k > 0?null:rear;
        }
    }
}
