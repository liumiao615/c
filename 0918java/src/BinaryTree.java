public class BinaryTree {
    public static class Node{
        private Node left=null;
        private Node right=null;
        private char val;

        private Node(char val){
            this.val=val;
        }
        public String toString(){
            return String.format("%s",val);
        }
    }
    private static Node buildTree(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');
        Node i=new Node('I');
        Node j=new Node('J');
        Node k=new Node('K');
        Node l=new Node('L');
        Node m=new Node('M');
        Node n=new Node('N');
        Node o=new Node('O');
        Node p=new Node('P');

        a.left=b;a.right=c;
        b.left=d;b.right=d;
        c.right=f;
        d.left=g;
        e.left=h;e.right=i;
        f.right=j;
        g.left=k;g.right=l;
        h.right=m;
        i.right=n;
        j.left=o;j.right=p;

        return a;
    }

    public static void main(String[] args) {
        buildTree();
    }
}
