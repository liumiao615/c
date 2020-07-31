package J0728;

public class RemoveElement {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
//        if(head == null){
//            return null;
//        }
//        ListNode new_head = null;
//        ListNode new_tail = null;
//        ListNode cur = head;
//        while(cur != null){
//            if(cur.val == val){
//                cur = cur.next;
//                continue;
//            }else {
//                if(new_head == null){
//                    new_head = cur;
//                    new_tail = cur;
//                }
//                new_tail.next = cur;
//                new_tail = new_tail.next;
//
//            }
//            cur = cur.next;
//        }
//        if(new_head == null){
//            return null;
//        }else {
//            return new_head;
//        }
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode tail = null;
        while(cur != null){
            if(cur.val == val){
                if(cur == head){
                    head = cur.next;
                }
                tail.next = cur.next;
            }else {
                tail = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
