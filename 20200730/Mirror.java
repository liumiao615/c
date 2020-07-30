package J0728;

public class Mirror {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;
        Mirror(root.left);
        Mirror(root.right);
    }
}
