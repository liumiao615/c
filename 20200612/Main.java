import java.util.ArrayList;
import java.util.List;

public class Tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> left = preorderTraversal(root.left);
        List<Integer> right = preorderTraversal(root.right);

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(left);
        list.addAll(right);
        return list;
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return (p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}