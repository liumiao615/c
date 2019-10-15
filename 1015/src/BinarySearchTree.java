//public class BinarySearchTree {
//    public boolean insert(int key,int value) {
//        if (root == null) {
//            root = new Node(key,value);
//            return true;
//        }
//
//        Node cur = root;
//        Node parent = null;
//        while (cur != null) {
//            if (key == cur.key) {
//                return false;
//            } else if (key < cur.key) {
//                parent = cur;
//                cur = cur.left;
//            } else {
//                parent = cur;
//                cur = cur.right;
//            }
//        }
//
//        Node node = new Node(key,value);
//        if (key < parent.key) {
//            parent.left = node;
//        } else {
//            parent.right = node;
//        }
//        return true;
//    }
//    public static void get1(int k){
////        search(k);
//    }
//
//    /**
//     * 根据key值查找value
////     * @param k
//     * @return
//     */
////    public static int search(int k) {
////        Node father = root;
////        while (father == null) {
////
////        }
////    }
////
////    public static int getOrDeafault(int k,int deafault) {
////        search(k);
////
////    }
//
//
//
//
//    public static class Node {
//        int key;
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int key,int value){
//            this.key = key;
//            this.value = value;
//        }
//    }
//    public static Node root;
//    private int size;
//
//    public static void main(String[] args) {
//        BinarySearchTree tree = new BinarySearchTree();
//        Node node = new Node(1,1000);
//
//    }
//}
