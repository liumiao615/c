public class Hash {
    public static class Node{
        private Node next;
        private int key;
        private int value;

        public Node(int key,int value){
            this.key = key;
            this.value = value;

        }
    }
    private Node[] array;
    private int size;
    public int get(int key){
        int index = key % array.length;
        for(Node cur = array[index];cur != null;cur = cur.next){
            if(key == cur.key) {
                return cur.value;
            }
        }
        return -1;
    }
}
