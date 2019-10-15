import java.util.Map;

public class reviewClass {
    public static class Node{
        private int key;
        private int value;
        private Node left;
        private Node right;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey(){
            return key;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root = null;
    public int get(int key){
        Node cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur.value;
            }else if (key < cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return -1;
    }
    public int getOrdeFault(int key,int defaultValue){
        Node cur = root;
        while(cur != null){
            if(key == cur.key){
                return cur.value;
            }else if(key < cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return defaultValue;
    }
    public int set(int key,int value){
        Node cur = root;
        Node p = null;
        if(cur == null){
            root = new Node(key,value);
            return 1;
        }
        while(cur != null){
            if(key == cur.key){
                int oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }else if(key < cur.key){
                p = cur;
                cur = cur.left;
            }else {
                p = cur;
                cur = cur.right;
            }
        }
        if(cur == p.left){
            p.left = new Node(key,value);
        }else {
            p.right = new Node(key, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        reviewClass test = new reviewClass();
        test.set(2,10);
        System.out.println(test.set(2,20));
    }
}
