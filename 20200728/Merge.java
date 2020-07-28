package J0728;

public class Merge {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    public ListNode merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode head = null;
        ListNode tail = null;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                if(head == null){
                    head = cur1;
                }else{
                    tail.next = cur1;
                }
                tail = cur1;
                cur1 = cur1.next;
            }
            else{
                if(head == null){
                    head = cur2;
                }else{
                    tail.next = cur2;
                }
                tail = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur1 != null){
            tail.next = cur1;
        }else{
            tail.next = cur2;
        }
        return head;
    }
    }
}
