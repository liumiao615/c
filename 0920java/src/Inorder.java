import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int leftCount;
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

    public TreeNode buildTree2(List<Integer> preorder,List<Integer> inorder){
        if(preorder.isEmpty()){
            return null;
        }
        int rootValue=preorder.get(0);
        int leftCount=inorder.indexOf(rootValue);
        List<Integer> leftPreorder=preorder.subList(1,leftCount+1);
        List<Integer> leftinorder=inorder.subList(0,leftCount);
        List<Integer> rightpreorder=preorder.subList(leftCount+1,preorder.size());
        List<Integer> rightinorder = inorder.subList(leftCount+1,inorder.size());
        TreeNode root=new TreeNode(rootValue);
        root.left=buildTree2(leftPreorder,leftinorder);
        root.right=buildTree2(rightpreorder,rightinorder);
        return root;
    }
//    TreeNode buildTree3(int[] preorder,int[] inorder){
//
//    }
    //build tree return value
    public static class BTRV{
        private TreeNode root;
        private int used;
    }
    public BTRV buildTree5(List<Integer> prorder){
        if(prorder.isEmpty()){
            BTRV returnValue=new BTRV();
            returnValue.root=null;
            returnValue.used=0;
            return returnValue;
        }
        int rootValue=prorder.get(0);
        if(rootValue=='#'){
            BTRV returnValue = new BTRV();
            returnValue.used=1;
            returnValue.root=null;
            return returnValue;
        }
        BTRV leftReturn = buildTree5(prorder.subList(1,prorder.size()));
        BTRV rightReturn = buildTree5(prorder.subList(1+leftReturn.used,prorder.size()));
        TreeNode root=new TreeNode(rootValue);
        root.left=leftReturn.root;
        root.right=rightReturn.root;

        BTRV returnValue=new BTRV();
        returnValue.root=root;
        returnValue.used=1+leftReturn.used+rightReturn.used;

        return returnValue;
    }
//    private static TreeNode Tree(){
//        TreeNode a=new TreeNode(1);
//        TreeNode b=new TreeNode(2);
//        TreeNode c=new TreeNode(3);
//        TreeNode d=new TreeNode(4);
//        TreeNode e=new TreeNode(5);
//        TreeNode f=new TreeNode(6);
//        TreeNode g=new TreeNode(7);
//        TreeNode h=new TreeNode(8);
//        a.left=b;a.right=c;
//        b.left=d;b.right=e;
//        c.left=f;c.right=g;
//        e.right=h;
//        return a;
//    }


    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        int[] postorder={9,15,7,20,3};
        Inorder a=new Inorder();
        TreeNode b= a.buildTree(inorder,postorder);
        System.out.println(b);
    }

}






//    236
//    105

