package J0726;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode head1 = listNode;
        ListNode head2 = listNode;
        int count = 0;
        while(head1 != null){
            head1 = head1.next;
            count++;
        }
        int[] arr = new int[count];
        int i = 0;
        while(head2 != null){
            arr[i++] = head2.val;
            head2 = head2.next;
        }
        for(int j = arr.length - 1;j >= 0;j--){
            list.add(arr[j]);
        }
        return list;
    }
    public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        printListFromTailTohead(list,listNode);

        return list;
    }

    private static void printListFromTailTohead(ArrayList<Integer> list, ListNode listNode) {
        if(listNode == null){
            return;
        }else {
            printListFromTailTohead(list,listNode.next);
            list.add(listNode.val);
        }
    }
    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack stack = new Stack();
        ListNode node = listNode;
        while(node != null){
            stack.push(node.val);
            node = node.next;
        }
        while(!stack.empty()){
            list.add((Integer) stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
