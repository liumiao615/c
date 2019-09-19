public class Tree {
    //写了一棵树
        //静态内部类表示这个结点类是属于二叉树类的
        private static class Node {
            private char val;
            private Node left = null;
            private Node right = null;

            private Node(char val) {
                this.val = val;
            }


            @Override
            public String toString() {
                return String.format("{%c}", val);
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

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.left = f;
            c.right = g;
            e.right = h;

            return a;
        }
        //前序遍历
        public static void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static void inOrderTraversal(Node root){
            if(root==null){
                return ;
            }
            inOrderTraversal(root.left);
            System.out.println(root);
            inOrderTraversal(root.right);
        }
        public static void postOrderTraversal(Node root){
            if(root==null){
                return ;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root);
        }
        //记录体位置独立在遍历体之外
        private static int count=0;
        private static void getSize1(Node root){
            if(root==null){
                return;
            }
            count++;
            getSize1(root.left);
            getSize1(root.right);
        }
        private static int getSize2(Node root){
            if(root==null){
                return 0;
            }

            int left=getSize2(root.left);
            int right=getSize2(root.right);
            return left+right+1;
        }
        //求叶子的结点个数
        private static int leafSize=0;
        private static void getleftSize1(Node root){
            if(root==null){
                return ;
            }
            if(root.left==null&&root.right==null){
                leafSize++;
            }
            getleftSize1(root.left);
            getleftSize1(root.right);

        }
        private static int getLeafSize2(Node root){
            if(root==null){
                return 0;
            }
            if(root.left==null&&root.right==null){
                return 1;
            }
            int left = getLeafSize2(root.left);
            int right = getLeafSize2(root.right);

            return (left+right);
        }
        //求二叉树的高度
        private static int getHeight(Node root){
            if(root==null){
                return 0;
            }
            int left=getHeight(root.left);
            int right=getHeight(root.right);
            return Math.max(left,right)+1;//求两数最大数
        }
        //求二叉树第k层的节点个数
        private static int getLevelSize(Node root,int k){
            if(root==null){
                return 0;
            }
            if(k==1){
                return 1;
            }
            int left=getLevelSize(root.left,k-1);
            int right=getLevelSize(root.right,k-1);
            return left+right;
        }
        //给定二叉树，返回val结点的引用
        private static Node find(Node root,int val){
            if(root==null){
                return null;
            }
            if(root.val==val){
                return root;
            }
            Node n=find(root.left,val);
            if(n!=null){
                return n;
            }
            Node m=find(root.right,val);
            if(m!=null){
                return m;
            }
            return null;
        }
        private static boolean find2(Node root,int val){
            if(root==null){
                return false;
            }
            if(root.val==val){
                return true;
            }
            if(find2(root.left,val)){
                return true;
            }
            if(find2(root.right,val)){
                return true;
            }
            return false;
        }
        //public static boolean find3()
        //判断是否为镜像
        private static boolean isMirrorTree(Node p,Node q){
            if(p==null&&q==null){
                return true;
            }
            if(p==null||q==null){
                return false;
            }
            return (p.val==q.val&&isMirrorTree(p.left,q.right)&&isMirrorTree(p.right,q.left));
        }
        public static void main(String[] args){
            Node root=buildTree();
            preOrderTraversal(root);
            System.out.println("-----------");
            inOrderTraversal(root);
            System.out.println("-----------");
            postOrderTraversal(root);
            System.out.println("-----------");
            count=0;
            getSize1(root);
            System.out.println("结点个数1："+count);
            System.out.println("结点个数2："+getSize2(root));
            System.out.println("叶子结点个数2："+getLeafSize2(root));
            leafSize=0;
            getleftSize1(root);
            System.out.println("叶子结点个数1："+leafSize);
            System.out.println("高度："+getHeight(root));
            System.out.println("第k层结点个数："+getLevelSize(root,1));
            System.out.println("第k层结点个数："+getLevelSize(root,2));
            System.out.println("第k层结点个数："+getLevelSize(root,3));
            System.out.println("第k层结点个数："+getLevelSize(root,4));
            System.out.println("第k层结点个数："+getLevelSize(root,5));
            System.out.println(find(root,'G'));
            System.out.println(find(root,'A'));
            System.out.println(find(root,'I'));
            System.out.println(find2(root,'G'));
            System.out.println(find2(root,'A'));
            System.out.println(find2(root,'I'));
        }
    }

