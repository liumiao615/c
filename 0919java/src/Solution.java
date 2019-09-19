
class Solution {
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
    //t是否是s的子树
    public boolean find(Node s,Node t){
        if(s==null){
            return false;
        }
        if(s==t){
            return true;
        }
        if(find(s.left,t)){
            return true;
        }
        return find(s.right,t);
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root||q==root){
            return root;
        }
        boolean pInleft=find(root.left,p);
        boolean qInleft=find(root.left,q);
        // boolean pInright=find(root.right,p);
        // boolean qInright=find(root.right,q);
        if(pInleft&&qInleft){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!pInleft&&!qInleft){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

    public static void main(String[] args) {
        Node node=Tree();
        Node s=node;
        Node m=node.left.left;
        Solution l=new Solution();
        Node a=l.lowestCommonAncestor(node,s,m);
        System.out.println(a);
    }
}





















