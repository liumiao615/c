
import java.util.Arrays;

class TreeNode{
    public TreeNode left=null;
    public TreeNode right=null;
    public int val;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Inorder {
    public TreeNode buildTree(int[] inorder,int[] postorder){
        if(postorder.length==0){
            return null;
        }
        int rootValue=postorder[postorder.length-1];
        int leftCount=0;
        for(leftCount=0;leftCount<inorder.length;leftCount++){
            if(inorder[leftCount]==rootValue){
                break;
            }
        }
        TreeNode root=new TreeNode(rootValue);
        int[] leftpostorder=Arrays.copyOfRange(inorder,0,leftCount);
        int[] leftinorder=Arrays.copyOfRange(inorder,0,leftCount);
        root.left=buildTree(leftpostorder,leftinorder);
        int[] rightpostorder= Arrays.copyOfRange(postorder,leftCount,postorder.length-1);
        int[] rightinorder=Arrays.copyOfRange(inorder,leftCount+1,inorder.length);
        root.right=buildTree(rightinorder,rightpostorder);
        return root;
    }

}






//    TreeNode buildTree(List<Integer>) preorder,List<Integer> inorder
//    236
//    105
