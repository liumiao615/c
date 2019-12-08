public class Plus {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
//            ListNode cur1 = a;
//            ListNode cur2 = b;
//            ListNode head = null;
//            ListNode tail = null;
//            while (cur1 != null && cur2 != null) {
//                if (head == null) {
//                    head.val = cur1.val + cur2.val;
//                    head = cur1;
//                } else {
//
//                    tail.val = cur1.val + cur2.val;
//                    tail.next = cur1;
//                    tail = cur1;
//                }
//                cur1 = cur1.next;
//                cur2 = cur2.next;
//            }
//            if(cur1 == null){
//                tail.next = cur2;
//            }else {
//                tail.next = cur1;
//            }
//            return head;
//        }
        ListNode Head = new ListNode(-1);
        ListNode tail = Head;
        int addto = 0;
        while(a != null || b != null || addto != 0){
            int aval = a != null ? a.val : 0;
            int bVal = b != null ? b.val : 0;

            int sum = aval + bVal + addto;
            int nodeD = sum % 10;
            addto = sum / 10;
            tail.next = new ListNode(nodeD);
            Head = tail.next;

            a = a != null ? a.next:null;
            b = b != null ? b.next:null;
        }
        return Head.next;
    }
}
