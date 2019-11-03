import java.lang.reflect.Array;
import java.util.Arrays;

public class offer4 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) { val = x; }
 }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0){
            return null;
        }
        int rootValue = pre[0];
        int b = 0;
        for(;b < in.length;b++){
            if(rootValue == in[b]){
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftinorder = Arrays.copyOfRange(in,0,b);
        int []leftpreorder = Arrays.copyOfRange(pre,1,b + 1);
        root.left = reConstructBinaryTree(leftpreorder,leftinorder);
        int []rightinorder = Arrays.copyOfRange(in,b + 1,in.length );
        int[] rightpreqrder = Arrays.copyOfRange(pre,b + 1,pre.length);
        root.right = reConstructBinaryTree(rightpreqrder,rightinorder);
        return root;

    }

}