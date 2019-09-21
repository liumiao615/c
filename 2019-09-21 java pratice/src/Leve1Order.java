import java.util.LinkedList;
import java.util.Queue;

public class Leve1Order {
    public static class Node{
        char val;
        Node left;
        Node right;

        Node(char val){
            this.val=val;
        }
    }
    public static Node buildTree() {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;

        return a;
    }
    public static void Order(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.poll();
            System.out.println(front.val);
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }

        }
    }
    private static class NodeLevel {
        public Node node;
        public int level;

        NodeLevel(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
        public static void Order2(Node root){
            if(root==null){
                return;
            }
            Queue<NodeLevel> queue=new LinkedList<>();
            queue.offer(new NodeLevel(root,1));
            while(!queue.isEmpty()){
                NodeLevel front=queue.poll();
                System.out.println(front.level+":"+front.node.val);
                if(front.node.left!=null){
                    queue.add(new NodeLevel(front.node.left,front.level+1));
                }
                if(front.node.right!=null){
                    queue.add(new NodeLevel(front.node.right,front.level+1));
                }
            }
        }
        public static boolean IsCompeleTree(Node root){
             if(root==null){
                 return true;
             }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while (true) {
                Node front = queue.poll();
                // 判断 front 是不是空结点
                if (front == null) {
                    break;
                }
                queue.offer(front.left);
                queue.offer(front.right);
            }
            // 去检查队列中是否全为 null 了
            while (!queue.isEmpty()) {
                Node n = queue.poll();
                if (n != null) {
                    return false;
                }
            }

            return true;


        }

    public static void main(String[] args) {
        Node root=buildTree();
        Order(root);
        Order2(root);
    }
}
