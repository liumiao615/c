import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        int leftCount;
        for (leftCount = 0; leftCount < inorder.length; leftCount++) {
            if (inorder[leftCount] == rootValue) {
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftPreorder = Arrays.copyOfRange(preorder,
                1, 1 + leftCount);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftCount);
        root.left = buildTree(leftPreorder, leftInorder);
        int[] rightPreorder = Arrays.copyOfRange(preorder,
                1 + leftCount, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder,
                leftCount + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}
