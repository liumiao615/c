public class HashBucket {
    private static class Node{
        private int key;
        private int value;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.value = val;
        }
    }
    private static final double LOAD_FACTOR = 0.75;
    private Node[] array;
    private int size;

    public int put(int key,int val){
        int index = key % array.length;
        for(Node cur = array[index];cur!=null;cur = cur.next){
            if(key == cur.key){
                int oldV = cur.value;
                cur.value = val;
                return oldV;
            }
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        size++;

        return -1;
    }
}
