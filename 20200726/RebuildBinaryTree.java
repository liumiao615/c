package J0726;

import java.util.Arrays;

public class RebuildBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode reConstructBinaryTree前中(int [] pre,int [] in) {
        if(pre.length == 0){
            return null;
        }
        int rootValue = pre[0];
        int j = 0;
        for(;j < in.length;j++){
            if(in[j] == rootValue){
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftinorder = Arrays.copyOfRange(in,0,j);
        int[] leftPreorder = Arrays.copyOfRange(pre,1,j + 1);
        root.left = reConstructBinaryTree前中(leftPreorder,leftinorder);
        int[] rightinorder = Arrays.copyOfRange(in,j+1,in.length);
        int[] rightPreorder = Arrays.copyOfRange(pre,j+1,pre.length);
        root.right = reConstructBinaryTree前中(rightPreorder,rightinorder);
        return root;
    }
    public TreeNode reConstructBinaryTree中后(int [] last,int [] in) {
        if(last.length == 0){
            return null;
        }
        int rootValue = last[last.length - 1];
        int j = 0;
        for(;j < in.length;j++){
            if(in[j] == rootValue){
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftinorder = Arrays.copyOfRange(in,0,j);
        int[] leftlastorder = Arrays.copyOfRange(last,0,j );
        root.left = reConstructBinaryTree中后(leftlastorder,leftinorder);
        int[] rightinorder = Arrays.copyOfRange(in,j+1,in.length);
        int[] rightlastorder = Arrays.copyOfRange(last,j+ 1,last.length-1);
        root.right = reConstructBinaryTree中后(rightlastorder,rightinorder);
        return root;
    }
    }
