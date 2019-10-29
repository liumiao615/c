import java.util.ArrayList;
import java.util.List;

//public class offer1 {
//    class ListNode{
//        ListNode next = null;
//
//    }
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = ;
//        while (cur != null){
//
//        }
//    }
//}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class offer1 {
    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}