//public class Getk extends Father {


//
//
//    public static void inOrderTraversal(Node root) {
//        if (root == null) {
//            return;
//        }
//        inOrderTraversal(root.left);
//        System.out.println(root);
//        inOrderTraversal(root.right);
//    }
//
//
//    public static Node find(Node root, int val) {
//        if (root == null) {
//            return null;
//        }
//        if (val == root.val) {
//            return root;
//        }
//        Node n= find(root.left, val);
//        if(n!=null){
//            return n;
//        }
//        Node m=find(root.right,val);
//        if(m!=null){
//            return m;
//        }
//        return null;
//    }
//    public static boolean find1(Node root,int val){
//        if(root==null){
//            return false;
//        }
//        if(root.val==val){
//            return true;
//        }
//        if(find(root.left,val)!=null){
//            return true;
//        }
//        if(find(root.right,val)!=null){
//            return true;
//        }
//        return false;
//    }
//    //互为镜像
//    public static boolean isMirrorTree(Node p,Node q){
//        if(p==null&&q==null){
//            return true;
//        }
//        if(p==null||q==null){
//            return false;
//        }
//        return(p.val==q.val&&isMirrorTree(p.left,q.right)&&isMirrorTree(p.right,q.left));
//    }
//}
