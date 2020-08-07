public class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	
	public TreeNode(int val){
		this.val = val;
	}
}
public class IsSameFromBegin{
	public boolean Issame(TreeNode begin,TreeNode beginsub){
		if(beginsub == null){
			return true;
		}
		if(begin == null){
			return false;
		}
		if(begin.val != beginsub.val){
			return false;
		}
		
		return Issame(begin.left,beginsub,left) && Issame(begin.right,beginsub,right);
		
	}
	public boolean HasSubTree(TreeNode root1,TreeNode root2){
		if(root1 == null || root2 == null){
			return false;
		}
		boolean result = false;
		if(root1.val == root2.val){
			result = Issame(root1,root2);
		}
		if(result == false){
			result = HasSubTree(root1.left,root2);
		}
		if(result == false){
			result = HasSubTree(root1.right,root2);
		}
		return result;
	}
}