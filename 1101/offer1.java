import java.util.ArrayList;
import java.util.Stack;

public class offer1 {
    class ListNode{
        ListNode next = null;
        int val;
        ListNode(int val){
            this.val = val;
        }


    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = listNode;
        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }

}
//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int x){
//        val = x;
//    }
//}
//public class offer1 {
//    public ListNode reverseList(ListNode head){
//        ListNode cur = head;
//        ListNode pre = null;
//        while(cur != null){
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }
//}