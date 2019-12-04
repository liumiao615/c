public class banl {
    public static int H(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = H(root.left);
        int right = H(root.right);
        return Math.max(left,right) + 1;
    }
    public boolean isBalance(TreeNode root){
        if (root == null){
            return false;
        }
        if (Math.abs(H(root.left)-H(root.right)) > 1){
            return false;
        }else {
            return isBalance(root.left)&&isBalance(root.right);
        }
    }
}
