public class Contact {
    public static class Node {
        Node left;
        Node right;

        String name;
        String phone;
    }
    private Node root = null;
    public boolean search(String name){
        Node cur = root;
        int r = name.compareTo(name);
        if(r == 0){
            return true;
        }else if(r > 0){
            cur = cur.right;
        }else {
            cur = cur.left;
        }
        return false;
    }
}
