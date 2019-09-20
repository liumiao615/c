class Solution {
    public static class TreeNode{
        private TreeNode left=null;
        private TreeNode right=null;
        private int  val;

        public TreeNode(int val){
            this.val=val;
        }


        @Override
        public String toString() {
            return String.format("{%d}", val);
        }
    }

    private static TreeNode Tree(){
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(8);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.right=h;
        return a;
    }
    public boolean find(TreeNode s ,TreeNode t){
        if(s==null){
            return false;
        }
        if(s==t){
            return true;
        }
        if(find(s.left,t)){
            return true;
        }
        return (find(s.right,t));
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root||q==root){
            return root;
        }
        boolean leftp=find(root.left,p);
        boolean leftq=find(root.left,q);
        boolean rightp=find(root.right,p);
        boolean rightq=find(root.right,q);
        if(leftp&&leftq){
            return lowestCommonAncestor(root.left,p,q);
        }
        // if(rightp&&rightq){
        //     return lowestCommonAncestor(root.right,p,q);
        // }
        if(!leftp&&!leftq){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode node=Tree();
        TreeNode s=node.left.right;
        TreeNode m=node.left.left;
        Solution l=new Solution();
        TreeNode a=l.lowestCommonAncestor(node,s,m);
        System.out.println(a);
    }
}