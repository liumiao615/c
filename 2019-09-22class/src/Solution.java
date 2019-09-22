import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static class Node{
        Node left;
        Node right;
         int val;
         Node(int val){
             this.val=val;
         }
    }
    public static void preorder(Node root){
        Stack<Node> stack=new Stack<Node>();
        Node cur=root;
        while(cur!=null&&!stack.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.pop();
            cur=top.right;
        }
    }
    public static List<Integer> inorder(Node root){
        Stack<Node> stack=new Stack<Node>();
        List<Integer> list=new ArrayList<>();
        Node cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.add(cur);
                cur=cur.left;
            }
            Node top=stack.pop();
            list.add(top.val);
            cur=top.right;
        }
        return list;
    }
















    public List<Integer> preorder2(Node root){
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack=new Stack<Node>();
        Node cur=root;
        while(cur!=null&&!list.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(root);
                cur=cur.left;
            }
            Node top=stack.pop();

        }
        return list;
    }
}
