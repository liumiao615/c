import java.util.*;
public class Main{
	public boolean isBalance(TreeNode root){
		if(root == null){
			return true;
		}
		int leftHeight = gettreeHeight(root.left);
		int rightHeight = gettreeHeight(root.right);
		
		if(Math.abs(leftHeight - rightHeight) > 1){
			return false;
		}
		return isBalance(root.left)&&isBalance(root.right);
	}
	
	public static int gettreeHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		return Math.max(gettreeHeight(root.left),gettreeHeight(root.right)) + 1;
	}
}