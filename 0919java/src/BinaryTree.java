import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static class Node{
        private Node left=null;
        private Node right=null;
        private int  val;

        public Node(int val){
            this.val=val;
        }


        @Override
        public String toString() {
            return String.format("{%d}", val);
        }
    }

    private static Node Tree(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.right=h;
        return a;
    }
    private static Node Tree2(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.right=h;
        return a;
    }

    //汇总思想二叉树的后序遍历List<Integer>
    public static List<Integer> postOrdersal(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> left=postOrdersal(root.left);
        List<Integer> right=postOrdersal(root.right);
        List<Integer> list=new ArrayList<>();
        list.addAll(left);
        list.addAll(right);
        list.add(root.val);
        System.out.println(root.val);
        return list;
    }

    //遍历思想二叉树的后序遍历List<Integer>
    public static List<Integer> list=new ArrayList<>();
    public static void postorder(Node root){
        if(root!=null){

           postorder(root.left);
           postorder(root.right);
            list.add(root.val);
            System.out.println(root.val);
        }
    }
    public  List<Integer> postOrderTraversal(Node root){
        list.clear();
        postorder(root);
        return list;
    }
    //二叉树的后序遍历
    public static void postOrderTraversal2(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal2(root.left);
        postOrderTraversal2(root.right);
        System.out.println(root);
    }
    public static boolean isSameTree(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null){
            return false;
        }
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //t是不是s的一颗子树
    public boolean isSubTree1(Node s,Node t){
        if(s==null){
            return false;
        }
        if(s==t){
            return true;
        }
        if(isSameTree(s,t)){
            return true;
        }
        if(isSubTree1(s.left,t)){
            return true;
        }
        return isSubTree1(s.right,t);
    }

    public static void main(String[] args) {
        Node node=Tree();
        Node node2=Tree2();
        new BinaryTree().
        postOrderTraversal(node);
        BinaryTree q=new BinaryTree();
        q.postOrderTraversal(node);
        System.out.println("------------");
        postOrdersal(node);
        System.out.println("------------");
        postOrderTraversal2(node);
        boolean l= isSameTree(node,node2);
        System.out.println(l);

    }
}
