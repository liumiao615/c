import java.util.Arrays;

public class Solution {
    public class Node{
        Node left;
        Node right;
        int k;


        public Node(int k) {
            this.k = k;
        }
    }
    Node root = null;
    //查找
    public Node search(int k){
        Node cur = root;
        while(cur!=null){
            if(k == cur.k){
                return cur;
            }else if(k < cur.k){
                cur = cur.left;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }
    //插入
    public boolean insert(int k){
        Node cur1 = root;
        Node parent = null;
        while(cur1!=null){
            if(k == cur1.k){
                return true;
            }else if(k < cur1.k){
                parent = cur1;//让parent一直指向前驱
                cur1 = cur1.left;
            }else {
                cur1 = cur1.left;
            }
        }
        Node node = new Node(k);
        if(k < parent.k){
            parent.left = node;
        }else {
            parent.right = node;
        }
        return false;
    }

//    public static void main(String[] args) {
//        int[] array = {4,3,7,9,1,5,0,2,6};
//        Solution< > tree = new Solution();
//        for(int i:array){
//
//        }
//
//    }
}
