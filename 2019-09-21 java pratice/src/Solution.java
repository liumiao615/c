//给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
import java.util.*;

public class Solution {
    public static class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;

        TreeNode(char val){
            this.val=val;
        }
    }
    private static class NL{
        TreeNode node;
        int level;
        NL(TreeNode node,int level){
            this.level=level;
            this.node=node;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<NL> queue = new LinkedList<>();
        queue.offer(new NL(root, 0));
        while(!queue.isEmpty()){
            NL front=queue.poll();
            System.out.println(front.level+":"+front.node.val);
            if(front.node.left!=null){
                queue.offer(new NL(front.node.left,front.level+1));
            }
            if(front.node.right!=null){
                queue.offer(new NL(front.node.right,front.level+1));
            }
        }
        return ret;
    }
}
