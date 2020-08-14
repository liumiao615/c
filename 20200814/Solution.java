import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public static void BTSOfPath(TreeNode root,int target,ArrayList<ArrayList<Integer>> arraylist,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        target -= root.val;
        if(root.left == null && root.right == null && target == 0){
            arraylist.add(new ArrayList<Integer> (list));
        }
        BTSOfPath(root.left,target,arraylist,list);
        BTSOfPath(root.right,target,arraylist,list);
        list.remove(list.size() - 1);
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        BTSOfPath(root,target,arraylist,list);
        return arraylist;
    }
}