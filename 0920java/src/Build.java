import java.util.Arrays;
import java.util.Scanner;

public class Build {
    public static class TreeNode{
        public TreeNode left=null;
        public TreeNode right = null;
        public char val;

        private TreeNode(char val){
            this.val=val;
        }
    }
    public static class BV{
        TreeNode root;
        int used;
        public BV(TreeNode root,int used){
            this.used=used;
            this.root=root;
        }
    }
    public static BV buildTree(char []preorder){
        if(preorder.length==0){
             return new BV(null,0);
        }
        if(preorder[0]=='#'){
            return new BV(null,1);
        }
       TreeNode node = new TreeNode(preorder[0]);
       BV left=buildTree(Arrays.copyOfRange(preorder,1,preorder.length));
       BV right=buildTree(Arrays.copyOfRange(preorder,1+left.used,1+preorder.length));
       node.left=left.root;
       node.right=right.root;

       return new BV(node,1+left.used+right.used);
    }
    public static void write(TreeNode a){
        if(a!=null){
            write(a.left);
            System.out.print(a.val+" ");
            write(a.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.nextLine();
        char []array=line.toCharArray();
        BV bv=buildTree(array);
        write(bv.root);
    }
}
