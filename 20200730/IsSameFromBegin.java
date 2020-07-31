package J0728;

public class IsSameFromBegin {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
        public boolean HasSubTree(TreeNode p,TreeNode q){
            if(p == null || q == null){
                return false;
            }
            if(p == null && q == null){
                return true;
            }
            if(p.val == q.val){
                return IsSanme(p,q);
            }else {
                return HasSubTree(p.left,q) || HasSubTree(p.right,q);
            }
        }

        private boolean IsSanme(TreeNode p, TreeNode q) {
            if(p == null || q == null){
                return false;
            }

            return ((p.val == q.val) && IsSanme(p.left,q.left) && IsSanme(p.right,q.right));
        }
    }
}
