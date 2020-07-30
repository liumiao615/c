package J0728;

public class Reverselist {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
        public  ListNode ReverseList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }
            ListNode cur = null;
            while(head != null){
                ListNode p = head;
                head = head.next;
                p.next = cur;
                cur = p;
            }
            return cur;
        }
            public  ListNode ReverseList2(ListNode head){
                ListNode cur = null;

                while(head !=null){
                    ListNode p = head.next;
                    head.next = cur;
                    cur = head;
                    head = p;
                }
                return cur;
            }
        }
    }
