public class Balance {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static int height(TreeNode root){
        //TreeNode cur = root;
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
            }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        if(Math.abs(leftheight - rightheight) > 1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
}
