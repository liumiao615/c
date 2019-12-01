public class Partition2 {
    public class ListNode{
        ListNode next = null;
        int value;
        ListNode(int value){
            this.value = value;
        }
    }
    public ListNode partition1(ListNode pHead,int x){
        ListNode small = null;
        ListNode smalllast = null;
        ListNode big = null;
        ListNode biglast = null;
        ListNode head = pHead;
        while(head != null){
            if(head.value < x){
                if(small == null){
                    small = head;
                }else {
                    smalllast.next = head;
                }
                smalllast = head;
            }
            else {
                if(big == null){
                    big = head;
                }else {
                    biglast.next = head;
                }
                biglast = head;
            }
            head = head.next;
        }
        if(small == null){
            return big;
        }else {
            smalllast.next = big;
        }
        if(biglast != null){
            biglast.next = null;
        }
        return small;
    }

    public ListNode partition2(ListNode pHead,int x){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);

        ListNode s = small;
        ListNode b = big;
        while(cur != null){
            if(cur.value < x){
                s.next = new ListNode(cur.value);
                s = s.next;
            }else {
                b.next = new ListNode(cur.value);
                b = b.next;
            }
            cur = cur.next;
        }
        cur = small;
        while(cur.next != null && cur.next.value != -1){
            cur = cur.next;
        }
        cur.next = big.next;
        return small.next;
    }
    public ListNode partition3(ListNode pHead,int x){
        ListNode cur = pHead;
        ListNode small = null;
        ListNode big  = null;
        ListNode smalllast = null;
        ListNode biglast = null;
        while(cur != null){
            if(cur.value < x){
                if(small == null){
                    small = cur;
                }else {
                    smalllast.next = cur;
                }
                smalllast = cur;
            }else {
                if(big == null){
                    big = cur;
                }else {
                    biglast.next = cur;
                }
                biglast = cur;
            }
            cur = cur.next;
        }
        if(small == null){
            return big;
        }else {
            smalllast.next = big;
        }
        if(biglast != null){
            biglast.next = null;
        }
        return small;
    }
}